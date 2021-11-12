package AnotherProblems;

import java.util.Arrays;

public class WhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        WhetherMatrixCanBeObtainedByRotation w = new WhetherMatrixCanBeObtainedByRotation();
        int[][] mat = {{1,1},{0,1}};
        int[][] target = {{1,1},{1,0}};
        w.findRotation(mat, target);
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] result = mat;
        for(int i = 0; i < result.length*2; i++) {
            swapRows(result);
            transpose(result);
            if(Arrays.deepEquals(result, target)){
                return true;
            }
        }
        return false;
    }
    private void transpose(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                int temp = result[i][j];
                result[i][j] = result[j][i];
                result[j][i] = temp;
            }
        }
    }
    private void swapRows(int[][] result) {
        int lo = 0;
        int hi = result.length - 1;
        while (lo < hi) {
            int[] temp = result[lo];
            result[lo++] = result[hi];
            result[hi--] = temp;
        }
    }
}
