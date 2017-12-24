package com.leozzy.nine;

/**
 * Created by Leo
 */
interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    @Override
    public void menace(){
        System.out.println("DragonZilla.menace()");
    }
    @Override
    public void destroy(){
        System.out.println("DragonZilla.destroy()");
    }
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
class VeryBadVampire implements Vampire{

    @Override
    public void menace() {
        System.out.println("VeryBanVampire.menace()");
    }

    @Override
    public void destroy() {
        System.out.println("VeryBanVampire.destroy()");
    }

    @Override
    public void kill() {
        System.out.println("VeryBanVampire.kill()");
    }

    @Override
    public void drinkBlood() {
        System.out.println("VeryBanVampire.drinkBlood()");
    }
}
public class HorrorShow {
    static void u(Monster b){
        b.menace();
    }
    static void v(DangerousMonster d){
        d.menace();
        d.destroy();
    }
    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
