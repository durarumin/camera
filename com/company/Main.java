package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Shot shot = new Shot();
        try {
            shot.takePicture();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
