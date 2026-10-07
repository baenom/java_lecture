package bank.member;

import java.util.List;

public interface MemberDao {
	boolean save(Member m);
	List findAll();
	Member findById(String id);
	boolean update(Member m);
	boolean deiete(Member m);
	boolean existsById(String id);
}
