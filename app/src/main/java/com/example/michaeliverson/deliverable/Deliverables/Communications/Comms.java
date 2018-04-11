package com.example.michaeliverson.deliverable.Deliverables.Communications;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * Created by michaeliverson on 4/10/18.
 */

public class Comms {


    // Retrofit implmentation
    private Retrofit retrofit;

    public  Comms()
    {
    }

    public void builder()
    {
        RxJava2CallAdapterFactory rxAdapter = RxJava2CallAdapterFactory.create();
        this.retrofit = new Retrofit.Builder()
                        .baseUrl("https://maps.googleapis.com")
                        .addConverterFactory(MoshiConverterFactory.create())
                        .addCallAdapterFactory(rxAdapter)
                        .build();
    }


    public void grabData(String lat,String lng,String desination,String apiKey)
    {

    }

}
