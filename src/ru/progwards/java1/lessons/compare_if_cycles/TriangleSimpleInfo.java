package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {

    public static int maxSide(int a, int b, int c){
        int max = 0;
        if ((a >= b) & (a >= c)){
            max = a;
        } else if ((b >= a) & (b >= c)){
            max = b;
        } else if ((c >= a) & (c >= b)){
            max = c;
        } else if ((a==b) && (b==c)){
            max = a;
        }
        return max;
    }

    public static int minSide(int a, int b, int c){
        int min = 0;
        if ((a <= b) & (a <= c)){
            min = a;
        } else if ((b <= a) & (b <= c)){
            min = b;
        } else if ((c <= a) & (c <= b)){
            min = c;
        } else if ((a==b) && (b==c)){
            min = a;
        }
        return min;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean equ = (a == b) && (b == c);
        return equ;
    }

    public static void main(String[] args){
        System.out.println(maxSide(21,22,22));
        System.out.println(minSide(55,12,12));
        System.out.println(isEquilateralTriangle(20,21,20));
    }
}
