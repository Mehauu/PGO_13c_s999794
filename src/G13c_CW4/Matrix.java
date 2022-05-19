package G13c_CW4;

import java.util.Arrays;

public class Matrix {

    private static int[][] tempMatrix;
    private static int rows = 0;
    private int[][] matrix;

    public static void setUpMatrix(int rowCount, int columnCount) {
        tempMatrix = new int[rowCount][columnCount];
        rows=0;

    }

    public static void insertRow(int[] row) {
        for (int i = 0; i < row.length; i++) {
            tempMatrix[rows][i] = row[i];
        }

        rows++;
    }

    public static Matrix create() {

        Matrix m = new Matrix();
        m.copy(tempMatrix);
        tempMatrix = null;

        return m;
    }

    public void copy(int[][] tab) {
        matrix = Arrays.copyOf(tab, tab.length);

    }

    public int get(int row, int column) {
        return matrix[row][column];
    }

    public int rowsCount() {
        return matrix.length;
    }

    public int columnsCount() {
        return matrix[0].length;
    }

    public int[] getRow(int i)
    {
        return matrix[i];
    }

    public Matrix add(Matrix m) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] + m.get(i, j);
            }
        }
        return this;
    }

    public static Matrix add(Matrix m1, Matrix m2) {

        Matrix.setUpMatrix(m1.rowsCount(), m1.columnsCount());


        for (int i = 0; i < m1.rowsCount(); i++) {
            int[] row = new int[m1.getRow(0).length];
            for (int j = 0; j < row.length; j++) {
                row[j] = m1.get(i, j) + m2.get(i, j);
            }
            Matrix.insertRow(row);

        }
        Matrix m3 = Matrix.create();

        return m3;
    }


    public Matrix subtract(Matrix m) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] - m.get(i, j);
            }
        }
        return this;
    }

    public static Matrix subtract(Matrix m1, Matrix m2) {

        Matrix.setUpMatrix(m1.rowsCount(), m1.columnsCount());


        for (int i = 0; i < m1.rowsCount(); i++) {
            int[] row = new int[m1.getRow(0).length];
            for (int j = 0; j < row.length; j++) {
                row[j] = m1.get(i, j) - m2.get(i, j);
            }
            Matrix.insertRow(row);

        }
        Matrix m3 = Matrix.create();

        return m3;
    }


    public void print() {

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println();

    }

}
