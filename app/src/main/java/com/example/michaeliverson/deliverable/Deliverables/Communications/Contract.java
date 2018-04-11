package com.example.michaeliverson.deliverable.Deliverables.Communications;

import com.example.michaeliverson.deliverable.Data.Route;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by michaeliverson on 4/10/18.
 */

public interface Contract {

    @GET("/maps/api/directions/json?")
    Observable<ArrayList<Route>>Direction(@Query("origin")double lat, double lng, @Query("desination") String destination, @Query("key") String key);
}
