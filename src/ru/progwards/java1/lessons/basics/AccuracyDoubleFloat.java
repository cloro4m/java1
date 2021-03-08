package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius){
        double v = (4  * (3.14 * (radius * radius * radius)))/3;
        return  v;
    }

    public static float volumeBallFloat(float radius){
        float v = (float) ((4  * (3.14 * (radius * radius * radius)))/3);
        return  v;
    }

    public static double calculateAccuracy(double radius){
        float calc = (float) (volumeBallDouble(radius) - volumeBallFloat((float) radius));
        return calc;
    }

    public static void main(String[] args) {
        final double r = 6371.2D;
        System.out.println(volumeBallDouble(r));
        final float r1 = 6371.2F;
        System.out.println(volumeBallFloat(r1));
        System.out.println(calculateAccuracy(6371.2));
    }

}
