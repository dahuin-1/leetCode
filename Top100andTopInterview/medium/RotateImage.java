package Top100andTopInterview.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RotateImage {
    public static void main(String[] args) {
        RotateImage ri = new RotateImage();
        int [][] matrix ={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        ri.rotate(matrix);
    }
    public void rotate(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int length = matrix.length; //4
        System.out.println(length);
        for(int side = length; side > 1; side -= 2){
            int low = (length-1)/2; //1
            System.out.println(low);
            int high = low + side - 1; // 1 + 4 - 1 = 4
            System.out.println(high);
            for (int i = 0; i < side - 1; i++) {
                int temp = matrix[high-i][low]; // temp = [4][1]

                matrix[low][low+i] = temp; //[1][1]
            }

        }

    }
}
