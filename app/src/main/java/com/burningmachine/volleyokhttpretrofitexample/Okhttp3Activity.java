package com.burningmachine.volleyokhttpretrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Okhttp3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp3);
    }

    public Object getjsonResponse() {

        OkHttpClient okhttpclient = new OkHttpClient();
        String url = "http://json.com";
        Request request = new Request.Builder().url(url).build();
        Response response = null;

        try {
            response = okhttpclient.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
