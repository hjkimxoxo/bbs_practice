package bbs_practice.dto;

import java.util.Date;

public class Guest {
	private String id;
	private String pwd;
	private String name;
	private Date birthday;
	private String phone;
	private String email;
	private int gender;
	private Date joinDay;
	private String note;
	private String delYn;
	

	
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guest(String id) {
		super();
		this.id = id;
	}

	public Guest(String id, String pwd, String name, Date birthday, String phone, String email, int gender,
			Date joinDay, String note, String delYn) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.joinDay = joinDay;
		this.note = note;
		this.delYn = delYn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getJoinDay() {
		return joinDay;
	}

	public void setJoinDay(Date joinDay) {
		this.joinDay = joinDay;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	@Override
	public String toString() {
		return "Guest [id=" + id + ", pwd=" + pwd + ", name=" + name + ", birthday=" + birthday + ", phone=" + phone
				+ ", email=" + email + ", gender=" + gender + ", joinDay=" + joinDay + ", note=" + note + ", delYn="
				+ delYn + "]";
	}

	
}
