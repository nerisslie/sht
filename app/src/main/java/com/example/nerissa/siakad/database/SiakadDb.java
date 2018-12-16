package com.example.nerissa.siakad.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import com.example.nerissa.siakad.entity.Mahasiswa;
import com.example.nerissa.siakad.dao.MhsAdd;
import com.example.nerissa.siakad.entity.Nilai;
import com.example.nerissa.siakad.dao.NilaiAdd;

import java.util.concurrent.Executors;

@Database(entities ={Mahasiswa.class, Nilai.class},version = 1,exportSchema = false)
public abstract class SiakadDb extends RoomDatabase {

    private static SiakadDb INSTANCE;

    public abstract MhsAdd mhsAdd();

    public abstract NilaiAdd nilaiAdd();

    public synchronized static SiakadDb getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = buildDatabase(context);
        }
        return INSTANCE;
    }

    private static SiakadDb buildDatabase(final Context context) {
        return Room.databaseBuilder(context.getApplicationContext(),
                SiakadDb.class,
                "my-database")
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                            @Override
                            public void run() {
                                getInstance(context).mhsAdd().addMhs(Mahasiswa.addMhs());
                            }
                        });
                    }
                })
                .build();
    }

}