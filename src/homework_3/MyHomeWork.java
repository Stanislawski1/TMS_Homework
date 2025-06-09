package homework_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        loopOne();
        loopTwo();
        loopThree();
        loopFour();
        loopFive();
        loopSix();
    }


    public static void taskOne() {
        System.out.println("***********taskOne************");
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the date of month: ");
        String date = input.nextLine();
        switch (date) {
            case "1":
                System.out.println("Based on your data, it's winter now");
                break;
            case "2":
                System.out.println("Based on your data, it's winter now");
                break;
            case "3":
                System.out.println("Based on your data, it's Spring now");
                break;
            case "4":
                System.out.println("Based on your data, it's spring now");
                break;
            case "5":
                System.out.println("Based on your data, it's spring now");
                break;
            case "6":
                System.out.println("Based on your data, it's summer now");
                break;
            case "7":
                System.out.println("Based on your data, it's summer now");
                break;
            case "8":
                System.out.println("Based on your data, it's summer now");
                break;
            case "9":
                System.out.println("Based on your data, it's autumn now");
                break;
            case "10":
                System.out.println("Based on your data, it's autumn now");
                break;
            case "11":
                System.out.println("Based on your data, it's autumn now");
                break;
            case "12":
                System.out.println("Based on your data, it's winter now");
                break;
            case "0":
                System.out.println("There is no such month");
                break;
        }
    }


    public static void taskTwo() {
        System.out.println("***********taskTwo************");
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the date of month: ");
        int date = input.nextInt();
        if (date >= 1 && date < 3) {
            System.out.println("I think its winter now!");
        } else if (date >= 3 && date <= 5) {
            System.out.println("I think its spring now!");
        } else if (date >= 6 && date <= 8) {
            System.out.println("I think its summer now!");
        } else if (date >= 9 && date <= 11) {
            System.out.println("I think its autumn now!");
        } else if (date == 12) {
            System.out.println("I think its winter now!");
        } else {
            System.out.println("Your data is wrong");
        }
    }

    public static void taskThree() {
        System.out.println("***********taskThree************");
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your number");
        int num = input.nextInt();
        if ((num % 2) == 0) {
            System.out.println("Number " + num + " is even ");
        } else {
            if ((num % 1) == 0) {
                System.out.println("Number " + num + " is odd ");
            }
        }
    }

    public static void taskFour() {
        System.out.println("***********taskFour************");
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your temperature outside");
        int t = input.nextInt();
        if (t > -5) {
            System.out.println("Its warm outside");
        } else if (t >= -5 && t >= -20) {
            System.out.println("Its normal outside");
        } else if (t <= -20) {
            System.out.println("Its cold outside");
        } else {
            System.out.println("Your data is wrong");
        }
    }

    public static void taskFive() {
        System.out.println("***********taskFive************");
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your number and i will tell you what color of the rainbow it is");
        String color = input.nextLine();
        switch (color) {
            case "1":
                System.out.println("This is the first color of the rainbow - red!");
                break;
            case "2":
                System.out.println("This is the second color of the rainbow - orange!");
                break;
            case "3":
                System.out.println("This is the third color of the rainbow - yellow!");
                break;
            case "4":
                System.out.println("This is the fourth color of the rainbow - green!");
                break;
            case "5":
                System.out.println("This is the fifth color of the rainbow - blue!");
                break;
            case "6":
                System.out.println("This is the sixth color of the rainbow - indigo!");
                break;
            case "7":
                System.out.println("This is the seventh color of the rainbow - violet!");
                break;
        }
    }

    public static void loopOne() {

        System.out.println("***********loopOne************");
        for(int i = 1;i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println("Here are your odd numbers from 1 to 99: " + i);
            }
        }
    }

    public static void loopTwo() {
        System.out.println("***********loopTwo************");
        for(int i =5; i>=1; i--) {
            System.out.println("Here is your numbers: " + i);
        }
    }

    public static void loopThree(){
        Scanner input = new Scanner(System.in);
        System.out.println("***********loopThree************");
        System.out.println("Please write the number: ");
        int n = input.nextInt();
        if (n <= 0) {

            System.out.println("You write wrong number!");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
                System.out.println("Sum of numbers from 1 to " + n + "=" + sum);
            }
        }
    }

    public static void loopFour(){
        System.out.println("***********loopFour************");
        int i =7;
        while(i<= 98){
            System.out.println("here is your numbers: " + i);
            i += 7;
        }
    }

    public static void loopFive(){
        System.out.println("***********loopFive************");
        int i = 0;
        while( i >= -45 ){
            System.out.println("here is your number " + i);
            i -= 5;
        }
    }

    public static void loopSix(){
        System.out.println("***********loopSix************");
        for(int i = 10; i <=20; i++){
            int square = i*i;
            System.out.println("Squared " + i + " = " + square);
        }
    }
}




