package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {

    public static boolean isTriangle(int a, int b, int c){
        boolean side = (a < (b + c)) || (b < (a + c)) || (c < (a + b));
        return side;
    }

    public static boolean isRightTriangle(int a, int b, int c){
        boolean r = (a*a == (b*b + c*c)) || (b*b == (a*a + c*c)) || (c*c == (a*a + b*b));
        return r;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean iso = (a == b) || (b == c) || (c == a);
        return iso;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(3,3,9));
        System.out.println(isIsoscelesTriangle(3,3,3));
    }

}
