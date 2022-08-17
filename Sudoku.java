/*
Personal project
Sudoku Calculator
The Sudoku board doesn't have to be 9*9
WE COUNT FROM 0
Author: Jay Zhengjie Zhou
*/
import java.util.Scanner;
import java.util.Arrays;
public class Sudoku{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to sudoku solver!");
        System.out.println("I can deal with sudoku matrices that are bigger than 9*9!");
        System.out.println("Here we go.");
        System.out.println("The size of sudoku matrix should be square numbers (9,16,25,36...).");
        System.out.println("Rule: if the matrix is of size n, i.e. n*n, you can fill integer numbers from 1-n");
        System.out.println("There will not be duplicated numbers in each row, column, and box");
        System.out.println("The size of box is (n^0.5) * (n^0.5).");
        System.out.println("All structure is basically the same as 9*9 ordinary sudoku.");
        System.out.println("Type in the size of the given sudoku board (9 if it's an ordinary 9*9 matrix): ");
        int size = kb.nextInt();
        System.out.print("Type in the sudoku matrix. Type in 0 to represent blank.");
        System.out.println("The order is left to right, top to bottom. Please separate each number with space or enter.");
        int[][] m = generateMatrix(size,kb);
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
        fill(m);
        System.out.println("DONE! Here is the answer: ");
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }

    /**
     * This method will generate a 2-D array representing the given sudoku board to solve.
     * @param size size of the matrix (matrix.length)
     * @return matrix representing the given sudoku board (0 for blank)
     */
    public static int[][] generateMatrix(int size, Scanner kb){
        int [][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = kb.nextInt();
            }
        }
        return result;

        }


    /**
     * This method will fill the given sudoku matrix.
     * @param m The sudoku matrix to solve. (use 0 to represent blank)
     * @return for the sake of recursion
     */
    public static boolean fill(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 0){
                    for (int k = 1; k <= m.length; k++) {
                        m[i][j] = k;
                        if(check(m,i,j) && fill(m)){
                            return true;
                        }
                    }
                    m[i][j] = 0;
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * This method will check if the guess value for blank is legit.
     * @param m sudoku matrix after guessing
     * @param i row number of the blank
     * @param j column number of the blank
     * @return true if its legit
     */
    public static boolean check(int[][] m, int i, int j){
        return checkRow(m,i,j) && checkColumn(m,i,j) && checkBox(m,i,j);
    }

    /**
     * Check if the guess value is legit for its row.
     * @param m sudoku matrix after guessing
     * @param i row number of the blank
     * @param j column number of the blank
     * @return true if its legit for row
     */
    public static boolean checkRow(int[][] m, int i, int j){
        int[] toCheck = m[i];
        return checkArray(toCheck);
    }

    /**
     * Check if the guess value is legit for its column.
     * @param m sudoku matrix after guessing
     * @param i row number of the blank
     * @param j column number of the blank
     * @return true if its legit for column
     */
    public static boolean checkColumn(int[][] m, int i, int j){
        int[] toCheck = new int[m.length];
        for (int k = 0; k < m.length; k++) {
            toCheck[k] = m[k][j];
        }
        return checkArray(toCheck);
    }

    /**
     * Check if the guess value is legit for its box.
     * @param m sudoku matrix after guessing
     * @param i row number of the blank
     * @param j column number of the blank
     * @return true if its legit for box
     */
    public static boolean checkBox(int[][] m, int i, int j){
        //we will calculate the coordinate of the cell
        //at the left top cell of the corresponding box to locate box
        int boxSize = (int) Math.pow(m.length,0.5);
        int row = i / boxSize * boxSize;
        int column = j / boxSize * boxSize;
        int[] toCheck = new int[m.length];
        int counter = 0;
        for (int k = row; k < row + boxSize; k++) {
            for (int l = column; l < column + boxSize; l++) {
                toCheck[counter] = m[k][l];
                counter ++;
            }

        }
        return checkArray(toCheck);
    }

    /**
     * Check array duplication. (Ignore 0)
     * @param toCheck array to check
     * @return true if there is NO duplication (legit)
     */
    public static boolean checkArray(int[] toCheck){
        for (int k = 0; k < toCheck.length; k++) {
            for (int l = 0; l < toCheck.length; l++) {
                if (toCheck[k] != 0 && l != k && toCheck[k] == toCheck[l]){
                    return false;
                }
            }
        }
        return true;
    }
}
