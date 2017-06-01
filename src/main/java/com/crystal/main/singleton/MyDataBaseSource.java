package com.crystal.main.singleton;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Created by hp on 2017-06-01.
 */
public enum MyDataBaseSource {
    DATASOURCE;
    private ComboPooledDataSource cpds;

    MyDataBaseSource(){
        cpds = null;
        try {
        /*--------获取properties文件内容------------*/
            // 方法一:
//            InputStream is = MyDataBaseSource.class.getClassLoader().getResourceAsStream("jdbc.properties");
//            Properties p = new Properties();
//            p.load(is);
            //方法二
//            ResourceBundle rb = PropertyResourceBundle.getBundle("jdbc");
//            System.out.println(rb.getString("driverClass"));

            //方法三
            ResourceBundle rs = ResourceBundle.getBundle("jdbc");
            cpds = new ComboPooledDataSource();
            cpds.setDriverClass(rs.getString("driverClass"));
            cpds.setJdbcUrl(rs.getString("jdbcUrl"));
            cpds.setUser(rs.getString("user"));
            cpds.setPassword(rs.getString("password"));
            cpds.setMaxPoolSize(Integer.parseInt(rs.getString("maxPoolSize")));
            cpds.setMinPoolSize(Integer.parseInt(rs.getString("minPoolSize")));
            System.out.println("-----调用了构造方法------");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        try{
            return cpds.getConnection();
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
