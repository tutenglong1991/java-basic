package tuling.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonSortMethods {
    /**
     *
     1.将数组分成已排序段和未排序段，初始化时已排序端只有一个元素
     2.到未排序段取元素插入到已排序段，并且保证插入后仍然有序
     3.重复上述操作，直到未排序段全部取完
    */
    public static ArrayList InsertionSort(int[] a) {
        int l = a.length;
        //这里会有2层排序,这次表示的是未排序的数组
        //时间复杂度：最坏的情况,n^2
        //最好的情况：o(n)
        for(int i=1; i<a.length; i++) {
            int currentCard = a[i];
            //这里从尾部开始往前找对比，是因为可以减少移位的次数，数组是从后面开辟空间的，每次移位都会重新分配内存
            int j=i-1;
            //这层表示的是已排序的数组，当前已排序元素中某个数值比取过来的数值大，则往后移动
            for(;j>=0; j--) {
                if(a[j] > currentCard){//升序排列
                    a[j+1] = a[j];
                }else{ //因为前面已经是排好序的，所以找到一个比当前取的值小的就不用继续找了，因为前面的肯定更小
                    break;//最好的情况，每次都走进这个分支o(1)
                }
            }
            a[j+1] = currentCard;
        }
        ArrayList A = new ArrayList();
        for (int i:a) {
            A.add(i);
        }
        return A;
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
//        int[] one = new int[]{4,1,2,5,7,1,2,6,3,2,9,7,5,4,5,2,3};
//        int[] two = new int[]{5,9,6,8,4,5,1,2,10,2,4,55,8,98,101};
        int[] one = new int[]{1,2,5,8,7};
        int[] two = new int[]{0,3,6,9,4,10,52,99};
        System.out.println(CommonSortMethods.InsertionSort(two));
//        CommonSortMethods.combinesTwoList(one, two);
    }

}
