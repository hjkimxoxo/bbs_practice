package bbs_practice.dao;

import java.util.ArrayList;

import bbs_practice.dto.Guest;

public interface GuestDao {

	int login(String id, String pwd);

	//Guest selectGuestById(String id);
	
	ArrayList<Guest> guestList();

	
}
