package Zadachki.MinMax;

import java.util.Arrays;

public class ProstCh {
    public static void main(String[] args) {
        int test_array[] = {0,1,2,2,3,0,4,2};
        System.out.println( test_array.toString().toUpperCase());

        int[][] newArr2 = { {1, 2, 3}, {4, 5}, {7} };
        System.out.println(Arrays.deepToString(newArr2));
        System.out.println(newArr2[0][2]); // 3
        System.out.println(newArr2[1][1]); // 5

        for (int i = 0; i < newArr2.length; i++) {
//            newArr[0] - {1, 2, 3}
//            newArr[1] - {4, 5}
//            newArr[2] - {7}
            for (int j = 0; j < newArr2[i].length; j++) {
                newArr2[i][j] *= newArr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newArr2));

    }
}

