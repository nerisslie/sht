package com.example.nerissa.siakad;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "students")
public class Mahasiswa {

    @PrimaryKey @NonNull
    private String nim;

    @ColumnInfo(name = "student_name")
    private String name;

    @ColumnInfo(name = "student_jurusan")
    private String jurusan;

    @ColumnInfo(name = "student_password")
    private String password;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}