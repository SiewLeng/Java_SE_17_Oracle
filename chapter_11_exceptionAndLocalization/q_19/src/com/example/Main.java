package com.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        var fr = Locale.of("fr");
        Locale.setDefault(Locale.of("en", "US"));
        var b = ResourceBundle.getBundle("com.example.dolphins", fr);
        String name = b.getString("name");
        String age = b.getString("age");
        System.out.println(name + " " + age);
    }
    
}
