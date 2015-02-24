package com.moneymaker.steve.wgag;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Steve on 23/02/2015.
 */
public class Event {
    private int id;
    private String name;
    private String description;
    private Date date;
    private OutdoorRink rink;
    private Player host;
    private ArrayList<Player> attendees;
}
