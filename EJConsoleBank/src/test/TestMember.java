package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;

public class TestMember {
	public static void main(String[] args) {
		testMemberDao();
	}
	
	public static void testMemberDao() {
		MemberDao mdao = new MemberListDao();
		
		System.out.println(">>> 회원 추가 및 회원 목록");
		mdao.save(new Member("BaeEuijin","1111","BaeEuijin",null,null));
		mdao.save(new Member("porie","1111","porie",null,null));
		List<Member> mlist = mdao.findAll();
		
		printMemberList(mlist);
		System.out.println(">>> 회원 찾기");
		Member m = mdao.findById("porie");
		System.out.println(m);
		System.out.println(">>> 비번변경");
		m.setPassword("1234");
		mdao.update(m);
		printMemberList(mdao.findAll());
		System.out.println(">>> 회원 삭제");
		mdao.deiete(mdao.findById("porie"));
		printMemberList(mdao.findAll());
	}
	
	public static void printMemberList(List<Member> mlist) {
		for(Member m : mlist) {
			
			System.out.println(m);
		}
	}
}
