package bbs_practice.ds;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class JndiDsTest {
	
	@BeforeClass 
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	
	@Test
	public void testGetConnection() {
		System.out.printf("%s()%n", "testGetConnection");
		Connection con = JdbcUtil.getConnection();
		System.out.println(con);
		Assert.assertNotNull(con);
	}

}
