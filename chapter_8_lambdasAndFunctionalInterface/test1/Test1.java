package test1;

interface Converter { 
    long round(double num);
}

public class Test1 {
    public static void main(String[] args) {
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);
        System.out.println(methodRef.round(100.1));  
        System.out.println(lambda.round(100.1));  
    }
}