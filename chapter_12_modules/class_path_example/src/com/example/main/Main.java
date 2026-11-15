package com.example.main;

import com.google.gson.Gson;
import com.example.utils.Helper;

public class Main {

    public static void main(String[] args) { 
        Gson gson = new Gson(); 
        System.out.println("Gson initialized successfully!"); 

        String msg = Helper.getMessage(); 
        System.out.println(msg); 
    }
    
}
