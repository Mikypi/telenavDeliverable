package com.example.michaeliverson.deliverable.Deliverables.Convertion;

import com.example.michaeliverson.deliverable.Data.Route;

import java.io.Serializable;

/**
 * Created by michaeliverson on 4/10/18.
 */

public class CartesianClass implements Serializable
{
    private double xCoordinateOrigin;
    private double yCoordinateOrigin;
    private double xCoordinateDestination;
    private double yCoordinateDestination;
    private double direction;
    private Route route;

    public CartesianClass(double xCoordinateOrigin, double yCoordinateOrigin, double xCoordinateDestination, double yCoordinateDestination, double direction, Route route) {
        this.xCoordinateOrigin = xCoordinateOrigin;
        this.yCoordinateOrigin = yCoordinateOrigin;
        this.xCoordinateDestination = xCoordinateDestination;
        this.yCoordinateDestination = yCoordinateDestination;
        this.direction = direction;
        this.route = route;
    }

    public double getxCoordinateOrigin() {
        return xCoordinateOrigin;
    }

    public void setxCoordinateOrigin(double xCoordinateOrigin) {
        this.xCoordinateOrigin = xCoordinateOrigin;
    }

    public double getyCoordinateOrigin() {
        return yCoordinateOrigin;
    }

    public void setyCoordinateOrigin(double yCoordinateOrigin) {
        this.yCoordinateOrigin = yCoordinateOrigin;
    }

    public double getxCoordinateDestination() {
        return xCoordinateDestination;
    }

    public void setxCoordinateDestination(double xCoordinateDestination) {
        this.xCoordinateDestination = xCoordinateDestination;
    }

    public double getyCoordinateDestination() {
        return yCoordinateDestination;
    }

    public void setyCoordinateDestination(double yCoordinateDestination) {
        this.yCoordinateDestination = yCoordinateDestination;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
