package main.repository;

import main.config.DatabaseConnection;
import main.model.Account;
import main.model.AccountType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Optional;

public class AccountRepository {

    public void addAccount(Account account) {
        String query = "insert into accounts values (null, ?, ?, ?, ?)";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(query)) {
            statement.setString(1, account.getAccountNumber());
            statement.setDouble(2, account.getBalance());
            statement.setString(3, account.getType().toString());
            statement.setString(4, account.getCardNumber());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Optional<Account> getAccountById(long id) {
        String query = "select * from accounts acc where acc.id = ?";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(query)) {
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();

            while(result.next()) {
                long accountId = result.getLong(1);
                String accountNumber = result.getString(2);
                double balance = result.getDouble(3);
                AccountType type = AccountType.valueOf(result.getString(4));
                String cardNumber = result.getString(5);

                return Optional.of(new Account(accountId, accountNumber, balance, type, cardNumber));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    public double getTotalAmountByType(AccountType type) {
        double result = 0;
        String query = "{? = call total_amount_per_type(?)}";
        try(CallableStatement statement = DatabaseConnection.getInstance().prepareCall(query)){
            statement.registerOutParameter(1, Types.DOUBLE);
            statement.setString(2, type.toString());
            statement.execute();
            result = statement.getDouble(1);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return result;
    }
}
