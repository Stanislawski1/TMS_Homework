package homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args) {
        taskOne();
        startTheTask();
        startTaskTwo();
        startTaskThree();
        startTaskFour();


    }

    // Task One
    public static void taskOne() {
        System.out.println("***********taskOne***********");

    }

    public static void startTheTask() {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int userNumber = readUserInput();
        boolean isNumberInArray = checkNumberInArray(numbers, userNumber);
        printResult(userNumber, isNumberInArray);
    }

    public static int readUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please write the number for test: ");
        return input.nextInt();
    }

    public static boolean checkNumberInArray(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }

    public static void printResult(int number, boolean isFound) {
        if (isFound) {
            System.out.println("Number " + number + " is in array");
        } else {
            System.out.println("Number " + number + " is not in array");
        }
    }

    // Task Two

    public static void startTaskTwo() {

        System.out.println("***********taskTwo***********");
        Scanner scanner = new Scanner(System.in);

        int[] originalArray = {5, 10, 15, 20, 10, 25, 10, 30};
        System.out.println("Your old array is: " + Arrays.toString(originalArray));

        System.out.print("Enter the new size of array: ");
        int newSize = scanner.nextInt();

        int[] newArray = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            System.out.print("Enter the element #" + (i + 1) + ": ");
            newArray[i] = scanner.nextInt();
        }

        System.out.println("\nThe old array is removed.");
        System.out.println("Your new array: " + Arrays.toString(newArray));
    }


    // Task Three

    public static void startTaskThree() {

        System.out.println("***********taskThree***********");

        int size = getArraySize();

        if (size <= 0) {
            return;
        }

        double[] array = generateRandomArray(size);
        printArray(array);

        double min = findMinValue(array);
        double max = findMaxValue(array);
        double average = calculateAverage(array);

        printStats(min, max, average);
    }

    public static int getArraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным числом!");
        }

        return size;
    }

    public static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static void printArray(double[] array) {
        System.out.println("Random array: ");
        for (double num : array) {
            System.out.printf("%.4f ", num);
        }
        System.out.println();
    }

    public static double findMinValue(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findMaxValue(double[] array) {
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void printStats(double min, double max, double average) {
        System.out.println("\nStatistic: ");
        System.out.printf("Minimal is : %.4f\n", min);
        System.out.printf("Maximum is:  %.4f\n", max);
        System.out.printf("Average: %.4f\n", average);
    }

// Task Four

    public static double startTaskFour() {
        System.out.println("*********taskFour*********");
        int[] numbersOne = {1, 3, 5, 7, 9, 11};
        int[] numbersTwo = {2, 4, 6, 8, 10, 12};
        double sum = 0;
        double sumTwo = 0;
        for (double num : numbersOne) {
            sum += num;
        }
        for (double num2 : numbersTwo) {
            sumTwo += num2;
        }
        printResults(sum, sumTwo, numbersOne, numbersTwo);

        calculateGreaterImportance(sum, sumTwo);

        return sum;

    }

    public static double calculateGreaterImportance(double sum, double sumTwo) {
        if (sum > sumTwo) {
            System.out.println("In the first array, the average value is greater");
        } else {
            System.out.println("In the second array, the average value is greater");
        }
        return sum / sumTwo;
    }

    public static double printResults(double sum, double sumTwo, int[] numbersOne, int[] numbersTwo) {
        System.out.println("Array 1 :" + Arrays.toString(numbersOne));
        System.out.println("Array 2 : " + Arrays.toString(numbersTwo));
        System.out.println("Average of array one is " + sum);
        System.out.println("Average of array two is " + sumTwo);

        return sum / sumTwo;

    }


}

