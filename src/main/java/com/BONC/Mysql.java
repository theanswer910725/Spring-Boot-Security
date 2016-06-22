package com.BONC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql {

	public static void main(String[] args) {
		try {
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "mysql"); //链接本地MYSQL
            Statement stat = con.createStatement();
            stat.executeUpdate("insert into post(title, content, created) values('title', 'content', '2015-08-20 00:00:00')");
            ResultSet res = stat.executeQuery("select LAST_INSERT_ID()");
            int ret_id;
            if (res.next()) {
                ret_id = res.getInt(1);
                System.out.print(ret_id);
            }
        } catch (Exception e) {
            System.out.print("MYSQL ERROR:" + e.getMessage());
        }

	}

}
