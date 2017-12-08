package com.leozzy.six;

import java.util.Arrays;

/**
 * Created by Leo
 * singleton
 */
public class ConnectionManager {

    private  static  Connection[] connections = new Connection[5];

    public static Connection[] getConnctions(){
        for (int i = 0;i < connections.length;i++){
            connections[i] = Connection.getConnection();
        }
        return connections;
    }

    public static void main(String[] args) {
        Connection[] conns = getConnctions();
        System.out.println(Arrays.toString(conns));
    }
}
