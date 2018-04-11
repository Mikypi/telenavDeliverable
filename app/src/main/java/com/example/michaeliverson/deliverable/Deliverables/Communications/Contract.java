package com.example.michaeliverson.deliverable.Deliverables.Communications;

import com.example.michaeliverson.deliverable.Deliverables.Convertion.CartesianClass;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by michaeliverson on 4/10/18.
 */

public interface Contract {

    @GET("/maps/api/directions/")
    Observable<ArrayList<Route>>Direction()

}
