package com.moneymaker.steve.wgag;

import java.util.ArrayList;

/**
 * Created by Steve on 23/02/2015.
 */
public class Player extends Person {
    private int id;
    private int age;
    private int experience;
    private ArrayList<Player> buddies;

    public Player() {
    //    id = 0;
    //    age = 0;
    //    experience = 0;
    }

    public Player(String name) {
        this.name = name;
    }
}
