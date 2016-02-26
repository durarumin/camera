package com.company;

import java.io.IOException;
import java.util.TimerTask;

/**
 * Created by inomata on 2016/02/26.
 */
public class Schedule extends TimerTask {
    public void run(){
        Shooting shooting = new Shooting();

        try{
            //ŽB‰e
            shooting.takePicture();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
