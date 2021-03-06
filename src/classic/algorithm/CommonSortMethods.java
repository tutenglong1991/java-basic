package classic.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CommonSortMethods {
    public static void insertMethod(Integer[] a) {
        int j;
        for(int p=1; p<a.length; p++) {
            Integer tmp = a[p];
            for(j = p; j > 0 && tmp.compareTo(a[j-1]) < 0; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }

        for(Integer i: a) {
            System.out.print(i + "<");
        }
    }

    public static void combinesTwoList (int[] one, int[] two) {
        int i = 0;
        int j = 0;
        int[] three = new int[one.length + two.length];
        // 用数组three的长度去遍历
        for (int k = 0; k< three.length; k++) {
            // 判断当两个数组都还没超过各自的长度时，three数组中的索引为k只能为one或two索引为k上的任一个值
            if (i<one.length && j<two.length) {
                if (one[i] > two[j]) {
                    three[k] = two[j];
                    i++;
                } else {
                    three[k] = one[i];
                }
            } else if (i<one.length) {
                three[k] = one[i];
                i++;
            } else if (j<two.length) {
                three[k] = two[j];
                j++;
            }
        }
        System.out.println("两个数组组合后排序：" + Arrays.toString(three));
    }

    public static void main(String[] args) {
        Integer[] a = {12,11};
//        int[] one = new int[]{4,1,2,5,7,1,2,6,3,2,9,7,5,4,5,2,3};
//        int[] two = new int[]{5,9,6,8,4,5,1,2,10,2,4,55,8,98,101};
        int[] one = new int[]{1,2,5,8,7};
        int[] two = new int[]{0,3,6,9,4,10,52,99};
//        CommonSortMethods.insertMethod(a);
        CommonSortMethods.combinesTwoList(one, two);
    }

}
