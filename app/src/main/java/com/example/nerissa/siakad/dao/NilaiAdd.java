package com.example.nerissa.siakad.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.nerissa.siakad.entity.Nilai;

import java.util.List;

@Dao
public interface NilaiAdd {
    @Query("select * from nilai")
    List<Nilai> loadAllNilai();

    @Query("select * from nilai where nim_mhs = :nim_mhs")
    Nilai loadNilaiByNim(String nim_mhs);

    @Insert
    public void addNilai(Nilai nilai);

}
