package bank.account;

import java.util.List;

public interface AccountDao {
	boolean save(Account a);
	List<Account> findAll();
	Account findByNo(int no);
	List<Account> findByMemberId(String id);
	boolean update(Account a);
	boolean deiete(Account a);
}
