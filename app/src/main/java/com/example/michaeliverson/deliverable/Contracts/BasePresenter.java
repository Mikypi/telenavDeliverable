package com.example.michaeliverson.deliverable.Contracts;

/**
 * Created by michaeliverson on 4/10/18.
 */

public interface BasePresenter <V extends BaseView> {

    void addview(V view);

    void removeView();
}
