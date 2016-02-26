package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Timer;

public class Webcamera {

    public static void main(String[] args) {

        Config config = new Config();

        //íËä˙é¿çs
        Timer timer = new Timer();
        timer.schedule(new Schedule(),0,config.getInterval());
    }
}
