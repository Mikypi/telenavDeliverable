
package com.example.michaeliverson.deliverable.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class OverviewPolyline implements Serializable
{

    @SerializedName("points")
    @Expose
    private String points;
    private final static long serialVersionUID = -8816645313196783278L;

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public OverviewPolyline withPoints(String points) {
        this.points = points;
        return this;
    }

}
