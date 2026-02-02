package arrays_arraylist;

public class Array_2D {
    public static void main(String[] args) {

        int [][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        System.out.println(matrix[1][1]); //print an Element in Array

        //Print Matrix
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

        // Print with enhanced 'for'
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        int sumOneCol = 0;
        for(int i=0;i<matrix[1].length;i++){
            sumOneCol+=matrix[0][i]; // summe col [0]
        }
        System.out.println("Column Summe: " +sumOneCol);


        int totalSumme =0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                totalSumme += anInt; // summe ganze Matrix
            }
        }
        System.out.println("Total Summe: " +totalSumme);


        int diagSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagSum += matrix[i][i]; // matrix[0][0]+matrix[1][1]+matrix[2][2]
        }
        System.out.println("Diagonal Summe: "+diagSum);


        int[][] jagged = new int[4][];
        jagged[0] = new int[]{0};
        jagged[1] = new int[]{1, 2};
        jagged[2] = new int[]{3, 4, 5};
        jagged[3] = new int[]{6,7,8,9};

        for (int[] ints : jagged) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

}
