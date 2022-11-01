package tuling.algorithm;

public class AlgorithmsAfterClassPractice {
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

    /*判断一个数是不是2的N次方
    judgeTwoCiFangBasic:最基础版本，面试100分该解法最多50分
    judgeTwoCiFangAdvanced:高阶版本
    */
    public static boolean judgeTwoCiFangBasic (int n) {
        boolean flag = false;
        while (n > 1){
            if (n % 2 == 0) {
                n = n/2;
                flag = true;
            } else {
                n = n-2;
                flag = false;
            }
        }
        return flag;
    }

    public static boolean judgeTwoCiFangAdvanced (int n) {
        if((n & (n-1)) == 0){
            return true;
        }else{
            return  false;
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,1,0,0,0,1,1}; // 十进制99
        int[] B = new int[]{1,0,1,1,0,0,0}; // 十进制88
//        AlgorithmsAfterClassPractice.sumTwoBinaryList(A, B);
        Long startTime1 = System.currentTimeMillis();
        System.out.println(AlgorithmsAfterClassPractice.judgeTwoCiFangBasic(Integer.MAX_VALUE));
        Long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
        Long startTime2 = System.currentTimeMillis();
        System.out.println(AlgorithmsAfterClassPractice.judgeTwoCiFangAdvanced(Integer.MAX_VALUE));
        Long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2-startTime2);
    }

}
