package com.burningmachine.volleyokhttpretrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL="https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>> getHorses();

    int k = 10;

    int j = 10;
    int h = 10;
    int y = 10;

}
