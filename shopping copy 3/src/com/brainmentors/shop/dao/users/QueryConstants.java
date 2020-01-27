package com.brainmentors.shop.dao.users;

public interface QueryConstants {
	
	String LOGIN_SQL = "select userid, pwd from user_mst where userid=? and pwd=?";

}
