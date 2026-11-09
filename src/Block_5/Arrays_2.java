package Block_5;

public class Arrays_2 {
    static void main() {

        int [][] arr = createarray(100,100);
        printarray(arr);

    }

    public static int[][] createarray(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (i + j);
            }
        }
        return arr;
    }

    public static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 10 ) {
                    System.out.print(arr[i][j] + "   ");
                } else if (arr[i][j] < 100 ) {
                    System.out.print(arr[i][j] + "  ");
                }
                else {
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println("");
        }
    }
}
