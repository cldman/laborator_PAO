-- SET GLOBAL log_bin_trust_function_creators = 1; use this if exception occurs
-- This function has none of DETERMINISTIC, NO SQL, or READS SQL DATA in its declaration and binary logging is enabled
CREATE TABLE `accounts` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `accountNumber` varchar(100) NOT NULL,
                            `balance` double NOT NULL,
                            `type` varchar(100) NOT NULL,
                            `cardNumber` varchar(16) DEFAULT NULL,
                            PRIMARY KEY (`id`);

CREATE FUNCTION total_amount_per_type ( account_type varchar(100) )RETURNS DOUBLE
BEGIN
	DECLARE total_amount double;
SELECT sum(acc.balance) INTO total_amount FROM accounts acc WHERE acc.type = account_type;
RETURN total_amount;
END;