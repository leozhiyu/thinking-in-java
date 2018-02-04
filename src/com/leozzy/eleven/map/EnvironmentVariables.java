package com.leozzy.eleven.map;

import java.util.Map;

/**
 * @author Leo
 * @create 2018-02-04 12:22
 * @desc 显所有的操作系统环境变量
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for(Map.Entry entry : System.getenv().entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
