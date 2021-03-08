package ru.progwards.java1.lessons.basics;

public class ReverseDigits {

    public static int reverseDigits(int number){
        int d1 = (number / 100);
        int d2 = (number / 10) % 10;
        int d3 = ((number % 100) % 10);
        String d11 = String.valueOf(d1);
        String d12 = String.valueOf(d2);
        String d13 = String.valueOf(d3);
        String str1 = d13 + d12 + d11;
        number = Integer.parseInt(str1);
        System.out.println(number);
        return number;
    }
    public static void main(String[] args) {
        reverseDigits(642);
    }
}
