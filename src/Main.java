import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String developerName = "Zolotarova Y. D.";
        System.out.printf("\nDeveloper's name is: %s \n", developerName);

        Scanner in = new Scanner (System.in);
        System.out.print ( "Input a matrix dimension (7):");           //in my variant its 7
        int matrixDimension = in.nextInt ();
        System.out.printf ( "You pick a matrix dimension:% d \n", matrixDimension);

        long [][] matrix = new long[matrixDimension][matrixDimension];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                matrix[i][j]  = new Random().nextLong();

            }
        }
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n"));

        Scanner input = new Scanner (System.in);
        System.out.printf( "Input a row number (0- %d ):", (matrixDimension-1));
        int m = input.nextInt();
        System.out.printf ( "You pick a row number:% d \n", m);


        boolean isSorted = false;
        long buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0;  i < (matrix.length - 1); i++) {
                if (matrix[m][i + 1] < matrix[m][i]) {
                    isSorted = false;

                    for (int j = 0; j <= (matrix.length - 1); j++){
                        buf = matrix[j][i];
                        matrix[j][i] = matrix[j][i + 1];
                        matrix[j][i + 1] = buf;

                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n"));

    }

}