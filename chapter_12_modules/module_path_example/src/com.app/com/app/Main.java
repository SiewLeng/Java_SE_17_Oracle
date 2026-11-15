package com.app; 
 
import com.utils.Formatter;            // Importing from custom module 
import com.google.gson.Gson;           // Importing from external JAR 
 
public class Main { 
    public static void main(String[] args) { 
        Gson gson = new Gson(); 
        String jsonText = gson.toJson("Hello from modular Java!"); 
 
        String finalOutput = Formatter.format(jsonText); 
        System.out.println(finalOutput); 
    } 
}