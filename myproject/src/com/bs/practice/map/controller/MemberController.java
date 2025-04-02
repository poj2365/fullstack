package com.bs.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.bs.practice.map.model.vo.Member;

public class MemberController {	private HashMap map = new HashMap();
	
    public boolean joinMembership(String id, Member m) {
        if (map.containsKey(id)) {
            return false;
        }
        map.put(id, m);
        return true;
    }

    public boolean logIn(String id, String password) {
        if (map.containsKey(id)) {
            Member m = (Member)map.get(id);
            if (m.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean changePassword(String id, String oldPw, String newPw) {
        if (map.containsKey(id)) {
            Member m = (Member)map.get(id);
            if (m.getPassword().equals(oldPw)) {
                m.setPassword(newPw);
                return true;
            }
        }
        return false;
    }

    public void changeName(String id, String newName) {
        if (map.containsKey(id)) {
            Member m = (Member)map.get(id);
            m.setName(newName);
        }
    }

    public TreeMap sameName(String name) {
        TreeMap result = new TreeMap();
        for (Object id : map.keySet()) {
            Member m = (Member)map.get(id);
            if (m.getName().equals(name)) {
                result.put(id, name);
            }
        }
        return result;
    }
}
