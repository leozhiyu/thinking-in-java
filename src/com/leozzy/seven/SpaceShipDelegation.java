package com.leozzy.seven;

/**
 * Created by Leo
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(){
        this.name = name;
    }

    public void up(int vel){
        controls.up(vel);
    }

    public void down(int vel){
        controls.down(vel);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation();
        protector.up(100);
    }
}
