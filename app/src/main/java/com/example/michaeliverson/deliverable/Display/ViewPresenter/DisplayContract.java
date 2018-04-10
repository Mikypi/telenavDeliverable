package com.example.michaeliverson.deliverable.Display.ViewPresenter;

import com.example.michaeliverson.deliverable.Contracts.BasePresenter;
import com.example.michaeliverson.deliverable.Contracts.BaseView;

/**
 * Created by michaeliverson on 4/10/18.
 */

public interface DisplayContract {

    public interface View extends BaseView
    {
        public void onResume();
        public void onPause();
    }

    public interface Presenter extends BasePresenter<View>
    {

    }
}
