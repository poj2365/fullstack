package com.bs.hw.member.controller;

import com.bs.hw.member.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];

	// 현재 존재하는 멤버 수 반환
	public int existMemberNum() {
		int cnt = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				cnt++;
			}
		}
		return cnt;

	}

	public Boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (m[i].getId().equals(inputId)) {
					return true;
				}
			}
		}
		return false;
	}

	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new Member();
				m[i].setId(id);
				m[i].setName(name);
				m[i].setPassword(password);
				m[i].setEmail(email);
				m[i].setGender(gender);
				m[i].setAge(age);
				return;
			}
		}
	}

	public String searchId(String id) {
		String result = "";
		for (Member member : m) {
			if (member.getId().equals(id)) {
				result += member.inform() + "\n";
			}
		}
		return result;

	}

	public Member[] searchName(String name) {
		Member[] m1 = new Member[m.length];
		for (int i = 0; i < m.length; i++) {
			if (m[i].getName().equals(name)) {
				m1[i] = m[i];
			}
		}
		return m1;

	}

	public Member[] searchEmail(String email) {
		Member[] m1 = new Member[m.length];
		for (int i = 0; i < m.length; i++) {
			if (m[i].getEmail().equals(email)) {
				m1[i] = m[i];
				return m1;
			}
		}
		return m1;

	}

	public Boolean updatePassword(String id, String password) {
		String searchId = searchId(id);
		if (searchId.equals("")) {
			return false;
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i].getId().equals(id)) {
				m[i].setId(id);
				m[i].setPassword(password);
				return true;
			}
		}

		return false;

	}

	public Boolean updateName(String id, String name) {
		String searchId = searchId(id);
		if (searchId.equals("")) {
			return false;
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i].getId().equals(id)) {
				m[i].setId(id);
				m[i].setName(name);
				return true;
			}
		}

		return false;
	}

	public Boolean updateEmail(String id, String email) {
		String searchId = searchId(id);
		if (searchId.equals("")) {
			return false;
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i].getId().equals(id)) {
				m[i].setId(id);
				m[i].setEmail(email);
				return true;
			}
		}

		return false;

	}

	public Boolean delete(String id) {
		String searchId = searchId(id);
		if (searchId.equals("")) {
			return false;
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}

	public void deleteAll() {
		for (int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}

	public Member[] printAll() {
		return m;
	}
}
