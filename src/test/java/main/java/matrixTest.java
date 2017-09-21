package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class matrixTest {

    @Test
    public void addMatrix()
    {
        matrix matrix = new matrix();
        int[][] addMatrix = {{2,2},{2,2}};
        int[][] matrix1 = {{1,1},{1,1}};
        int[][] matrix2 = {{1,1},{1,1}};
        assertArrayEquals(addMatrix,matrix.addMatrix(matrix1,matrix2,2,2,2,2));
    }

    @Test
    public void subMatrix()
    {
        matrix matrix = new matrix();
        int[][] addMatrix = {{0,0},{0,0}};
        int[][] matrix1 = {{1,1},{1,1}};
        int[][] matrix2 = {{1,1},{1,1}};
        assertArrayEquals(addMatrix,matrix.subtractMatrix(matrix1,matrix2,2,2,2,2));
    }
    @Test
    public void mulMatrix()
    {
        matrix matrix = new matrix();
        int[][] addMatrix = {{1,3},{1,3}};
        int[][] matrix1 = {{1,1},{1,1}};
        int[][] matrix2 = {{1,1},{1,1}};
        assertArrayEquals(addMatrix,matrix.multiplyMatrix(matrix1,matrix2,2,2,2,2));
    }
    @Test
    public void transposeMatrix()
    {
        matrix matrix = new matrix();
        int[][] addMatrix = {{1,3},{2,4}};
        int[][] matrix1 = {{1,2},{3,4}};
        assertArrayEquals(addMatrix,matrix.transposeMatrix(matrix1,2,2));
    }
}