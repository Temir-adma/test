package com.example.anarbek.test;

import java.util.List;

import retrofit2.Call;
import  retrofit2.http.GET;
public interface Api {

    @GET("/items")
    Call<List<Record>> getRecord(String type);

}
