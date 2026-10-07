package bank.member;

import java.util.ArrayList;
import java.util.List;

public class MemberListDao implements MemberDao{
	
	List<Member> memberDB = new ArrayList<>();
	@Override
	public boolean save(Member m) {
		return memberDB.add(m);
	}

	@Override
	public List findAll() {
		if (memberDB.size() == 0) return null;
		List<Member> members = new ArrayList<>();
		for (Member m : memberDB) {
			members.add(m);
		}
		return members;
	}

	@Override
	public Member findById(String id) {
		for(Member m : memberDB) {
			if(m.getId().equals(id))
				return m;
		}
		return null;
	}

	@Override
	public boolean update(Member m) {
		Member target = findById(m.getId());
		if(target == null)return false;
		memberDB.remove(target);
		return memberDB.add(m);
		
	}

	@Override
	public boolean deiete(Member m) {
		Member target = findById(m.getId());
		if(target == null)return false;
		return memberDB.remove(target);
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
