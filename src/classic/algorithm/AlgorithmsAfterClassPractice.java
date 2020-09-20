package classic.algorithm;

import java.util.ArrayList;

public class AlgorithmsAfterClassPractice {

    public static void main(String[] args) {
        int[] A = new int[]{1,1,0,0,0,1,1}; // 十进制99
        int[] B = new int[]{1,0,1,1,0,0,0}; // 十进制88
        AlgorithmsAfterClassPractice.sumTwoBinaryList(A, B);
    }


    /*
    * 第二章：2.1-3,
    * 输入n个数的一个序列A和一个值v
    * 输出下标i，使得A[i]=v
    * */
    public static Object getIndexOfvalue (int[] array, int value) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return null;
    }

    /*
    * 第二章：2.1-4,
    * 输入：两个数组A、B分别存放两个二进制n位整数的各位数值
    * 输出：数组C用二进制表示A与B的和
    * */
    public static int[] sumTwoBinaryList (int[] A, int[] B) {
        int flag = 0;
        int[] C = new int[]{};
        for (int j = 0; j < A.length; j++) {
            int key = A[j] + B[j] + flag;
            C[j] = key % 2;
            if (key > 1) {
                flag = 1;
            }
        }
        if (flag == 1) {
            C[A.length+1] = 1;
        }
        return C;
    }

}
