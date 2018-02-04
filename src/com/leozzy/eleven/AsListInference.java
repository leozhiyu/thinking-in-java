package com.leozzy.eleven;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Leo
 */
class Snow{}
class Power extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args) {
        List list = new ArrayList(-1);
        list.add(1);
        /*List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Power());
        //snow1.remove(1);
        //snow1.add(new Heavy());

        List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3,new Light(),new Heavy());

        List<Snow> snow4 = Arrays.<Snow> asList(new Light(),new Heavy());*/
    }
}
