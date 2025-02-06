package com.careerit.cbook.day1;

public class BiggestOfThreeNumbers {

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 20;
        int num3 = 30;
        int big = Math.max(num1, Math.max(num2, num3));
        System.out.println("The biggest of "+num1+", "+num2+" and "+num3+" is "+big);

    }
}
