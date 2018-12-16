package com.example.nerissa.siakad;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MhsAdd {
    @Query("select * from students")
    List<Mahasiswa> loadAllMhs();

    @Query("select * from students where nim = :nim")
    Mahasiswa loadMhsByNim(String nim);

    @Query("select * from students where nim = :nim and student_password = :password")
    Mahasiswa loadMhsByNim(String nim, String password);

    @Insert
    public void addMhs(Mahasiswa mhs);

}
