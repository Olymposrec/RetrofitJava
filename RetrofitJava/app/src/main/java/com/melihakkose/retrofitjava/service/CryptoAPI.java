package com.melihakkose.retrofitjava.service;

import com.melihakkose.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    //URL BASE =https://api.nomics.com/v1/
    //GET -> prices?key=your-api-key
    @GET("prices?key=YOUR-API-KEY")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>>getData();

}
