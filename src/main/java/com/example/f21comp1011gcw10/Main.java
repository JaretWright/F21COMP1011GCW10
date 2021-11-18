package com.example.f21comp1011gcw10;

public class Main {
    public static void main(String[] args) {
        ApiResponse result = APIUtility.getMoviesJsonFile();
        System.out.println(result);
    }
}
