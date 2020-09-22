package com.melihakkose.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {
    //CEKILECEK VERILERIN ESLESMESI ICIN @SerializedName KULLANILIR AYNI OLMASI GEREKLI
    @SerializedName("currency")
    public String currency;

    @SerializedName("price")
    public String price;

}
