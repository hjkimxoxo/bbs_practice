package bbs_practice.service;

import bbs_practice.dao.GuestDao;
import bbs_practice.dao.impl.GuestDaoImpl;


public class GuestService {
	private GuestDao dao = GuestDaoImpl.getInstance();
	
	public int login(String id, String pwd) {
		return dao.login(id, pwd);
	}
	
	

}
