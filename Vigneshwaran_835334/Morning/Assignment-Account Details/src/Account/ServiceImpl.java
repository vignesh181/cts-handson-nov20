package Account;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service  {
	List<Pojo> data = new ArrayList<Pojo>();

	@Override
	public void add(int accountNumber, Double balance) throws Exception {

		int count = 0;

			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).getAccountNumber().equals(accountNumber)) {

					count = count + 1;

					throw new Exception("AccountAlreadyException");
				}

			}

			if (count == 0) {

				data.add(new Pojo(accountNumber, balance));
			}

		} 
	
		

	@Override
	public List<Pojo> findAccountByAccountNumber(int accountNumber) throws Exception {
		List<Pojo> account = new ArrayList<Pojo>();

		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getAccountNumber().equals(accountNumber))
				account.add(data.get(i));
		}

		if (account.size() == 0)
			throw new Exception("AccountNotFoundException");

			 
		return account;
	}

	@Override
	public void removeAccount(int accountNumber) throws Exception {

	
		
			if (findAccountByAccountNumber(accountNumber) == null) 

				throw new Exception("AccountNotFoundException");
			 
			else {
				for (int i = 0; i < data.size(); i++) {
					if (data.get(i).getAccountNumber().equals(accountNumber))

					{

						data.remove(i);
						System.out.println("Account " + accountNumber + " Removed Successfully");
					}
				}

			}

		}


	@Override
	public List<Pojo> displayAllAccounts() {
		
		
		
		return data;
	}

	public List<Pojo> displayBalanceLessThan1000() {

		int count = 0;
		List<Pojo> account = new ArrayList<Pojo>();
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getBalance() < 1000.0) {
				count = count + 1;
				account.add(data.get(i));
			}

		}
		if (count == 0) {
			System.out.println("no accounts found");
		}

		return account;
	}

}
