package com.example.nerissa.siakad;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface NilaiAdd {
    @Query("select * from nilai")
    List<Nilai> loadAllNilai();

    @Query("select * from nilai where nim = :nim")
    Nilai loadNilaiByNim(String nim);

    @Query("select * from nilai where nim = :nim and matkul = :matkul")
    Nilai loadNilaiByWhere(String nim, String matkul);

    @Insert
    public void addNilai(Nilai nilai);

}
