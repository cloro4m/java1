package ru.progwards.java1.lessons.basics;

public class Astronomy {

    public static Double sphereSquare(Double r){
        double s = 4 * (3.14 *(r *r));
        return s;
    }

    public static Double earthSquare(){
        double r = 6371.2;
        double s = sphereSquare(r);
        return s;
    }

    public static Double mercurySquare(){
        double r = 2439.7;
        double s = sphereSquare(r);
        return s;
    }

    public static Double jupiterSquare(){
        double r = 71492;
        double s = sphereSquare(r);
        return s;
    }

    public static Double earthVsMercury(){
        double earthvsmercury = earthSquare() / mercurySquare();
        return earthvsmercury;
    }

    public static Double earthVsJupiter(){
        double earthvsjupiter = earthSquare() / jupiterSquare();
        return  earthvsjupiter;
    }

    public static void main(String[] args) {
        //System.out.println(earthSquare());
        //System.out.println(mercurySquare());
        //System.out.println(jupiterSquare());
        //System.out.println(earthVsMercury());
        //System.out.println(earthVsJupiter());
    }
}
