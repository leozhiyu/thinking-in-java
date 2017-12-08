package com.leozzy.six;

/**
 * Created by Leo
 */
public class Connection {
    private Connection(){}
    public static Connection getConnection(){
        return new Connection();
    }
}
