package com.leozzy.ten.innerclasses.thirdpack;

import com.leozzy.ten.innerclasses.firstpack.Comm;
import com.leozzy.ten.innerclasses.secondpack.Outer;

/**
 * Created by Leo
 */
public class ChildOuter extends Outer {
    public Comm getInner(){
        return this.new Inner();
    }
}
