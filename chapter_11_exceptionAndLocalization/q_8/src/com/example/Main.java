package com.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("en", "US"));
        var b = ResourceBundle.getBundle("com.example.dolphins");
        System.out.println(b.getString("name"));
    }
    
}
