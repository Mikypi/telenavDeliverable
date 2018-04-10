package com.example.michaeliverson.deliverable.Contracts.Injection.Display;
import android.view.Display;

import com.example.michaeliverson.deliverable.Contracts.Modules.Display.DisplayModule;

import dagger.Component;


/**
 * Created by michaeliverson on 4/10/18.
 */

@Component(modules = DisplayModule.class)
public interface DisplayComponent {
    void inject(Display display);
}
