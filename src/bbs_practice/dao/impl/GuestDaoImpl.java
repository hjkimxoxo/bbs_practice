package bbs_practice.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbs_practice.dao.GuestDao;
import bbs_practice.ds.JdbcUtil;
import bbs_practice.ds.JndiDs;
import bbs_practice.dto.Guest;

public class GuestDaoImpl implements GuestDao {
	
	private static final GuestDaoImpl instance = new GuestDaoImpl();

	private GuestDaoImpl() {}

	public static GuestDaoImpl getInstance() {

		return instance;
	}

//	@Override
//	public Guest selectGuestById(Guest guest) {
//
//		String sql = "select GUEST_ID,GUEST_PWD,GUEST_NAME,GUEST_BIRTHDAY,GUEST_PHONE,GUEST_EMAIL,GUEST_GENDER,GUEST_JOIN_DAY,GUEST_NOTE,DEL_YN"
//				+ " from guest where guest_id = ?";
//		try (Connection con = JdbcUtil.getConnection(); 
//				PreparedStatement pstmt = con.prepareStatement(sql)) {
//			pstmt.setString(1, guest.getId());
//			try (ResultSet rs = pstmt.executeQuery()) {
//				if (rs.next()) {
//					return getGuest(rs);
//				}
//			}
//		} catch (SQLException e1) {
//			throw new RuntimeException(e1);
//		}
//		return null;
//	}

	private Guest getGuest(ResultSet rs) throws SQLException {
		Guest g = new Guest();
		g.setId(rs.getString("GUEST_ID"));
		g.setPwd(rs.getString("GUEST_PWD"));
		g.setName(rs.getString("GUEST_NAME"));
		g.setBirthday(rs.getTimestamp("GUEST_BIRTHDAY"));
		g.setPhone(rs.getString("GUEST_PHONE"));
		g.setEmail(rs.getString("GUEST_EMAIL"));
		g.setGender(rs.getInt("GUEST_GENDER"));
		g.setJoinDay(rs.getTimestamp("GUEST_JOIN_DAY"));
		g.setNote(rs.getString("GUEST_NOTE"));
		g.setDelYn(rs.getString("DEL_YN"));
		
		return g;
	}

	@Override
	public int login(String id, String pwd) {
		String sql = "select guest_pwd from guest where guest_id = ?";
		try (Connection con = JndiDs.getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(sql)){
					pstmt.setString(1, id);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						if(rs.getString(1).equals(pwd)) {
							return 1; //일치
						}else {
							return 0; //불일치
						}
					}
					return -1; //아이디없음
				}
		} catch (SQLException e1) {
			throw new RuntimeException(e1);
		}
	}

	@Override
	public ArrayList<Guest> guestList() {
		String sql = "select * from guest";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if(rs.next()) {
				ArrayList<Guest> list = new ArrayList<Guest>();
				do {
					list.add(getGuest(rs));
				}while (rs.next());
				return list;
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

}
