package bbs_practice.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bbs_practice.dao.impl.GuestDaoImpl;
import bbs_practice.dto.Guest;


public class GuestDaoTest {
	private GuestDao dao;
	
	@Before
	public void setUp() {
		dao = GuestDaoImpl.getInstance();
	}

	@After
	public void tearDown() {
		dao = null;
	}
	
	@Test
	public void testGuest() {
		int res = dao.login("test", "1234");
		Assert.assertEquals(1, res);
	}

}
