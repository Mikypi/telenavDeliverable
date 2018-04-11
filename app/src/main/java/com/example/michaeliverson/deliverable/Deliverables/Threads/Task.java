package com.example.michaeliverson.deliverable.Deliverables.Threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by michaeliverson on 4/10/18.
 */

public class Task implements Runnable
{

    private boolean stop;
    private String name;
    private int pauseTime;

    public Task(String name)
    {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    private int checkType(String name)
    {
        int toReturn = 0;
        switch (name)
        {
            case"Car":
            {
                toReturn = 500;
                break;
            }
            case "Walking":
            {
                toReturn = 1500;
                break;
            }
            case "Bike":
            {
                toReturn = 1000;
                break;
            }
        }
        return toReturn;
    }

    @Override
    public void run() {
        pauseTime = checkType(name);
        try
        {
            while (stop) {
                TimeUnit.MILLISECONDS.sleep(pauseTime);


            }
        }catch (Exception ex)
        {

        }

    }

    // Interrupt the thread
    public void interrupt()
    {
        this.stop = true;
    }

}
