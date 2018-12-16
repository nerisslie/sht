package com.example.nerissa.siakad;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities ={Mahasiswa.class},version = 1)
public abstract class SiakadDb extends RoomDatabase {

    public abstract MhsAdd mhsAdd();


}
