package com.zuxia.util;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by caitxj on 17-2-14.
 */
public class DBUtil {

    public static final String url="jdbc:mysql://localhost:3306/mysql";

    public static final String password="root";

    public static final String username="root";


    static {
        try {
            DriverManager.getConnection(url,username,password);
            System.out.println("OK...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

    }

}
