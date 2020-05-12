package com.pareandroid.haloumpar.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelTeknik {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("nbm")
    @Expose
    private String nbm;
    @SerializedName("nomorhp")
    @Expose
    private String nomorhp;
    @SerializedName("prodi")
    @Expose
    private String prodi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNbm() {
        return nbm;
    }

    public void setNbm(String nbm) {
        this.nbm = nbm;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

}

