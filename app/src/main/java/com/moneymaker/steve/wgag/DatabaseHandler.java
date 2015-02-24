package com.moneymaker.steve.wgag;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.*;

public class DatabaseHandler extends SQLiteOpenHelper {
	
	// All static variables
	// Database version
	private static final int DATABASE_VERSION = 1;
	
	// Database name
	private static final String DATABASE_NAME = "playerManager";
	
	// Player table name
	private static final String TABLE_PLAYER = "tPlayer";
	
	// Player table columns names
	private static final String KEY_ID = "id";
	private static final String KEY_NAME = "name";
	private static final String KEY_AGE = "age";
	
	public DatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	//Creating Tables
	@Override
	public void onCreate(SQLiteDatabase p1)
	{
		String CREATE_PLAYER_TABLE = "CREATE TABLE " + TABLE_PLAYER + "("
				+ KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
				+ KEY_AGE + " TEXT" + ")";
		p1.execSQL(CREATE_PLAYER_TABLE);
	}

	//Upgrading database
	@Override
	public void onUpgrade(SQLiteDatabase p1, int p2, int p3)
	{
		// TODO: Implement this method
	}
}
