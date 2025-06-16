package homework_5;

import java.util.Scanner;

public class myHomeWork {

    public static void main(String[] args) {

        int[][][] array = createArray();

        printArray("Original array: ", array);

        int increment = getValue();

        increaseElements(array,increment);

        printArray("Array after increase", array);

        System.out.println("Your Task 2: ");

        useWarp();


    }

    //Task One

    public static int[][][] createArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array (x y z): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int[][][] array = new int[x][y][z];
        fillArrayRandomly(array);
        return array;

    }

    public static void  fillArrayRandomly(int[][][] array){
        for(int i = 0; i< array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length;k++){
                    array[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }
    }

    public static int getValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to increase elements: ");
        return scanner.nextInt();
    }

    public static void increaseElements(int[][][] array, int increment){
        for(int i = 0;  i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    array[i][j][k] += increment;
                }
            }
        }

    }

    public static void printArray(String message, int[][][] array){
        System.out.println(message);
        for(int i = 0; i < array.length; i++){
            System.out.println("Layer" + (i+1) + ": ");
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    //Task Two

    public static void useWarp(){
        String[][] chessBoard = createChessBoard();
        fillingChessBoard(chessBoard);
        printBoard(chessBoard);
    }

    public static String[][] createChessBoard(){
        String[][] chessBoard = new String[8][8];
        return new String[8][8];

    }

    public static void fillingChessBoard(String[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = getColor(i,j);
            }
        }
    }

    public static String getColor(int row, int col){
        return(row + col) % 2 == 0 ? "W" : "B";
    }

    public static void printBoard(String[][] board){
        for(String[] row : board){
            for(String cell : row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}
