/**
 * @author:Leo
 * @create 2018/3/6
 * @desc
 */
package com.leozzy.twelve.throwexception;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
    public Inning() throws BaseballException{}
    public void event() throws BaseballException{}
    public abstract void atBat() throws Strike,Foul;
    public void walk(){}
}

class StormException extends Exception{}
class RaineOut extends StormException{}
class PopFoul extends Foul{}

interface Storm{
    public void event() throws RaineOut;
    public void rainHard() throws RaineOut;
}

public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RaineOut,BaseballException{}
    public StormyInning(String s) throws Foul,BaseballException{
    }
    //void walk() throws PopFoul{}
    //public void event() throws BaseballException{}
    public void rainHard() throws RaineOut{}
    public void event(){}
    public void atBat() throws PopFoul{}

    public static void main(String[] args){
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        }catch (PopFoul e){
            System.out.println("Pop foul");
        }catch (RaineOut e){
            System.out.println("Rained out");
        }catch (BaseballException e){
            System.out.println("Generic baseball exception");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        }catch (Strike e){
            System.out.println("Strike");
        }catch (Foul e){
            System.out.println("Foul");
        }catch (RaineOut e){
            System.out.println("Rained Out");
        }catch (BaseballException e){
            System.out.println("Generic baseball exception");
        }
    }

}
