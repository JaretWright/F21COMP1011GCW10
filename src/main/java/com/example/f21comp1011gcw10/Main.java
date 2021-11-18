package com.example.f21comp1011gcw10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ApiResponse result = null;
        try {
            result = APIUtility.getMoviesFromOMDB("Die Hard");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
