package com.example.nerissa.siakad;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "nilai")
public class Nilai {

    @PrimaryKey
    private String id;

    @ColumnInfo(name = "tanggal")
    private Date tanggal;

    @ColumnInfo(name = "matkul")
    private String matkul;

    @ColumnInfo(name = "jurusan")
    private String jurusan;

    @ColumnInfo(name = "nim")
    private String nim;

    @ColumnInfo(name = "nilai")
    private Double nilai;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Double getNilai() {
        return nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }
}
