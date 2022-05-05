package repository;

import config.DatabaseConnection;
import model.Account;
import model.AccountType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Optional;

public class AccountRepository {

    /*
     *   Statement
     *   PreparedStatement
     *   CallableStatement
     *
     * */

    public void addBankAccount(Account account) {
        String sql = "insert into accounts values (null, ?, ?, ?, ?) ";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
            statement.setString(1, account.getAccountNumber());
            statement.setDouble(2, account.getBalance());
            statement.setString(3, account.getType().toString());
            statement.setString(4, account.getCardNumber());
            statement.executeUpdate();
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Optional<Account> getBankAccountById(long id) {
        String sql = "select * from accounts ba where ba.id = ?";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                //i have at least one record in the result set
                long accountId = result.getLong(1);
                String accountNumber = result.getString("accountNumber");
                double balance = result.getDouble("balance");
                AccountType type = AccountType.valueOf(result.getString("type"));
                String cardNumber = result.getString("cardNumber");
                return Optional.of(new Account(accountId, accountNumber, balance, type, cardNumber));
            }
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public double getTotalAmountByType(AccountType type) {
        double result = 0;

        String sql = "{? = call total_amount_per_type(?)}";

        try (CallableStatement stmt = DatabaseConnection.getInstance().prepareCall(sql)) {
            stmt.registerOutParameter(1, Types.DOUBLE);
            stmt.setString(2, type.toString());
            stmt.execute();
            result = stmt.getDouble(1);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }
}
