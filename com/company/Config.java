package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by inomata on 2016/02/27.
 */
public class Config {
    int interval;
    boolean hd;
    boolean post;

    Config(){
        Properties config = new Properties();
        String config_path = "./config.properties";

        try {
            InputStream inputStream = new FileInputStream(config_path);
            config.load(inputStream);
            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        interval = Integer.parseInt(config.getProperty("interval"));
        hd = Boolean.parseBoolean(config.getProperty("hd"));
        post = Boolean.parseBoolean(config.getProperty("post"));
    }

    public int getInterval(){
        return this.interval;
    }

    public boolean getHd(){
        return this.hd;
    }

    public boolean getPost(){
        return this.post;
    }


}
