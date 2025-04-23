package anush.revisitdsa;

/**
 * graph representation
 * adjacency matrix and list
 */
public class Graph1 {
    public static void addEdge(int[][] mat, int i, int j) {
        mat[i][j] = 1;
        mat[j][i] = 1;
    }

    public void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.println(val + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int v = 4;
        int[][] mat = new int[v][v];
        addEdge(mat,1,0);

    }
}
