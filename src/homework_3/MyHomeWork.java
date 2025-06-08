package homework_3;

import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args) {
    taskOne();
    taskTwo();
    taskThree();
    taskFour();
    taskFive();
    taskSix();



    }

    public static void taskOne(){
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
        if (date >= 1 && date < 3){
            System.out.println("I think its winter now!");
        } else if (date >= 3 && date <= 5) {
            System.out.println("I think its spring now!");
        } else if (date >= 6 && date <= 8) {
            System.out.println("I think its summer now!");
        } else if (date >= 9 && date <= 11) {
            System.out.println("I think its autumn now!");
        } else if(date == 12) {
            System.out.println("I think its winter now!");
        }else {
            System.out.println("Your data is wrong");
    }
     }

    public static void taskThree(){
        System.out.println("***********taskThree************");
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your number");
        int num = input.nextInt();
        if((num%2)==0){
            System.out.println("Number " + num + " is even ");
        }
        else {
            if ((num % 1) == 0) {
                System.out.println("Number " + num + " is odd ");


            }
        }    }

    public static void taskFour(){
        System.out.println("***********taskFour************");
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your temperature outside");
        int t = input.nextInt();
        if(t > -5){
            System.out.println("Its warm outside");
        }else if (t >= -5 && t >= -20) {
            System.out.println("Its normal outside");
        }else if(t <= -20) {
            System.out.println("Its cold outside");
        }else{
            System.out.println("Your data is wrong");

        }

    }

    public static void taskFive(){
        System.out.println("***********taskFive************");
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your number and i will tell you what color of the rainbow it is");
        String color = input.nextLine();
        switch (color){
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

    public static void taskSix(){


    }

}




