package com.BDD.ex;

import java.util.Scanner;

public class FizzBuzzGame {
    public String play (int number) {
        if(number %3==0) {
            if (number %5==0) {
                return "fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(number);
    }
/*
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        System.out.println("Input a number:");
        int number = readNumber.nextInt();
        String fizzbuzzResult = play(number);
        System.out.println(fizzbuzzResult);

    } */

}

