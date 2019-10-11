package com.example.notesapp.Database.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.notesapp.Database.model.daos.NotesDao;

@Database(entities = {Note.class},version = 1,exportSchema = false)
public abstract class MyDataBase extends RoomDatabase {

    private static MyDataBase database;
    private  final static  String DATABASE_NAME="notesDatabaseroute";
    public abstract NotesDao notesDao();
    public static MyDataBase getInstance(Context context){
        if(database==null){
            //create
            database=  Room.databaseBuilder(context,MyDataBase.class,DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();

        }
       return database;
    }
}
