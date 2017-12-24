package com.leozzy.ten;

/**
 * Created by Leo
 */
class Out{
    class In{

    }
}
public class DotNew {
    public class Inn{}
    public static void main(String[] args) {
        Out o = new Out();
        Out.In in = o.new In();
        //Inn i = new Inn(); 编译错误
    }
}
