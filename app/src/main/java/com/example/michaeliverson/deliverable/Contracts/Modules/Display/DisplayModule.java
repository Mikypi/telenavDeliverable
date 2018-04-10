package com.example.michaeliverson.deliverable.Contracts.Modules.Display;

import com.example.michaeliverson.deliverable.Display.ViewPresenter.DisplayPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by michaeliverson on 4/10/18.
 */


@Module
public class DisplayModule {

    @Provides
    public DisplayPresenter provideDisplayPresenter()
    {
        return  new DisplayPresenter();
    }
}
