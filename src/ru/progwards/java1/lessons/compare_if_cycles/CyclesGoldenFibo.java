package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit){
        if (number == 0 && digit == 0) {
            return true;
        }
        for (; number > 0; ) {
            //System.out.println(number);
            if ((number % 10) == digit) {
                //System.out.println("number contains digit " + digit);
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }

    public static int fiboNumber(int n){
        int fib1 = 1, fib2 = 1, fib3 = 0;
        //System.out.print(fib1 + "," + fib2);
        for(int a = 3; a <=n; a++){
            fib3 = fib1 + fib2;
            //System.out.print("," + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib2;
    }

    public static boolean isGoldenTriangle(int a, int b, int c){
        float A = a, B = b, C = c, z;
        boolean gold = false;
        if ((a == b) || (b == c) || (c == a)){
            if (a==b) {
                if(a>c){
                    z = (A/C);
                } else {
                    z = (C/A);
                }
                gold = ((z >= 1.61703f)&&(z <= 1.61903f));
            } else if (b==c) {
                if(b>a){
                    z = (B/A);
                } else {
                    z = (A/B);
                }
                gold = ((z >= 1.61703f)&&(z <= 1.61903f));
            } else if (a==c) {
                if(a>b){
                    z = (A/B);
                } else {
                    z = (B/A);
                }
                gold = ((z >= 1.61703f)&&(z <= 1.61903f));
            }
        }
        return gold;
        }

    public static void main(String[] args){
        //System.out.println(containsDigit(1234, 2));
        //System.out.println(fiboNumber(1));
        //System.out.println(isGoldenTriangle(55,34,34));
        //fiboNumber(1);

        int fib1 = 1, fib2 = 1, fib3 = 0;
        //System.out.print(fib1 + ", "  + fib2+ ", ");
        for(int x = 3; x <= 15; x++){
            fib3 = fib1 + fib2;
            //System.out.print(fib3 + ", " );
            fib1 = fib2;
            fib2 = fib3;
            if (fib2<=100) {
                if (isGoldenTriangle(fib1, fib1, fib2)) {
                    System.out.println(" ");
                    System.out.print(" а = " + fib1);
                    System.out.print(" b = " + fib1);
                    System.out.print(" c = " + fib2);
                    System.out.println(" ");
                }
            }
        }
    }
}
