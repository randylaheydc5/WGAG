package com.moneymaker.steve.wgag;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Steve on 23/02/2015.
 */
public class OutdoorRink {
    private int id;
    private String name;
    private String location;
	private Date lastUpdated;
    private ArrayList<Player> volunteers;

    public OutdoorRink() {

    }
    public OutdoorRink(String name) {
        this.name = name;
    }
}
