package com.example.kuisdaftarkeluarga;

import android.graphics.drawable.Drawable;

public class Keluarga {


    public String nama, status,ttl;
    public Drawable gambar;
    public Drawable getGambar() {
        return gambar;
    }
    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }

    public Keluarga(Drawable gambar, String nama, String status,String ttl)
    {
        this.gambar = gambar;
        this.nama = nama;
        this.status = status;
        this.ttl = ttl;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
}
