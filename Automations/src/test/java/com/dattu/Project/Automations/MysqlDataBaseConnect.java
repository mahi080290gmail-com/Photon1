package com.dattu.Project.Automations;

import java.sql.DriverManager;

import org.testng.annotations.Test;

public class MysqlDataBaseConnect {
	@Test
	public void test() throws ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager.getConnection("jdbc:mysql://localhost:3036/emp", user, password)
	}

}
