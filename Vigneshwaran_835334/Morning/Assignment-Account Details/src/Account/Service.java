package Account;

import java.util.List;

public interface Service {

	void add(int accaccountNumber, Double balance) throws Exception;

	List<Pojo> findAccountByAccountNumber(int accountNumber)throws Exception;

	void removeAccount(int accountNumber)throws Exception;

	List<Pojo> displayAllAccounts();

	List<Pojo> displayBalanceLessThan1000();

}