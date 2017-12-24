package com.leozzy.eight;

/**
 * Created by Leo
 */
class Useful{
    public void f(){

    }
    public void g(){

    }
}

class MoreUseful extends Useful{
    public void f(){

    }
    public void g(){

    }
    public void v(){

    }
}
class LessUseful extends Useful{
    public void f(){

    }
    public void g(){

    }
    public void h(){

    }
}
public class RTTI {
    public static void main(String[] args) {
        Useful[] usefuls = {new Useful(),new MoreUseful()};
        usefuls[0].f();
        ((LessUseful)usefuls[1]).h();//只能向上转型或向下转型
    }

}
