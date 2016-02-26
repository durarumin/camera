package com.company;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by inomata on 2016/02/26.
 */
public class Shooting {
    public void takePicture() throws IOException {

        Config config = new Config();

        Webcam webcam = null;
        //汎用的なサイズ
        int width = 640;
        int height = 480;
        String filepath = "./picture/";

        File mkdir = new File(filepath);
        mkdir.mkdirs();

        Dimension[] nonStandardResolutions = new Dimension[] {
                WebcamResolution.HD720.getSize(),
                new Dimension(width, height)
        };

        webcam = Webcam.getDefault();
        if (webcam != null) {
            System.out.println("Webcam : " + webcam.getName());
            webcam.setCustomViewSizes(nonStandardResolutions);
            System.out.println(config.getHd());

            if(config.getHd()){
                webcam.setViewSize(WebcamResolution.HD720.getSize());
            }else {
                webcam.setViewSize(new Dimension(width, height));
            }
            webcam.open();
            File pict = new File(filepath + "image.png");
            ImageIO.write(webcam.getImage(), "PNG", pict);
            webcam.close();
        } else {
            System.out.println("Failed: Webcam Not Found Error");
        }
    }
}
