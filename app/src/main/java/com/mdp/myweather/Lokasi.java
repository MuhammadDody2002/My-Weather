package com.mdp.myweather;

import com.google.android.gms.maps.model.LatLng;

public class Lokasi {
    private String nama;
    private LatLng Latlng;

    public Lokasi() {

    }

    public Lokasi(String nama, LatLng latlng) {
        this.nama = nama;
        Latlng = latlng;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LatLng getLatlng() {
        return Latlng;
    }

    public void setLatlng(LatLng latlng) {
        Latlng = latlng;
    }
}