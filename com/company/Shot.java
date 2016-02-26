package com.company;

import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by inomata on 2016/02/26.
 */
public class Shot {
    public void takePicture() throws IOException {
        Webcam webcam = null;
        int width = 640;
        int height = 480;
        String filepath = "./picture/";

        File mkdir = new File(filepath);
        mkdir.mkdirs();

        webcam = Webcam.getDefault();
        if (webcam != null) {
            System.out.println("Webcam : " + webcam.getName());
            webcam.setViewSize(new Dimension(width, height));
            webcam.open();
            BufferedImage image = webcam.getImage();
            File pict = new File(filepath + "image"+width+"_"+height+".png");
            ImageIO.write(webcam.getImage(), "PNG", pict);
            webcam.close();
        } else {
            System.out.println("Failed: Webcam Not Found Error");
        }
    }
}
