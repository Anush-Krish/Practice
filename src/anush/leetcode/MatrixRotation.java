package anush.leetcode;

public class MatrixRotation {

    private static void transpose(int[][] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(arr, i, j);
            }
        }
    }

    private static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    private static void rowReverse(int[][] arr, int n) {

        int i = 0;
        int j = n - 1;

        for (int k = 0; k < n; k++) {


            while (i < j) {
                swap(arr, k, i);
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transpose(arr, arr.length);
        //rotation of rows
        rowReverse(arr, arr.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.print("\n");
        }


    }
}
