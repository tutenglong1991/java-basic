package leetcode;


import java.util.ArrayList;
import java.util.List;

public class  LeetCodeAlgorithmSets{
    //数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字；
    //分析题目：题目中存在一个陷阱就是这样的元素一定是只存在一个，因为如果存在两个或以上的话一定不可能都超过长度的一半，只能是等于
    //再一个需要考虑为空或只有一个数组的情况；
    public static String findNumGreaterThanListLengthUseDoubleFor(int[] myList) {
        int targetNum = 0;
        if(myList.length == 0) {
            return "数组不能为空";
        } else if(myList.length == 1){
            return "该数组中元素出现次数超过数组长度一半的元素是：" + Integer.toString(myList[0]);
        }else{
            for (int i = 0; i < myList.length - 1; i++) {
                int count = 1;
                for (int j = i + 1; j < myList.length; j++) { //此处需要注意j=i+1的处理，不能直接写成j=1，因为这样外层的循环每次必须再与第二个元素到最后一个元素全部对比一遍
                    if (myList[i] == myList[j]) {
                        count++;
                    }
                }
                if (count > myList.length / 2) {
                    targetNum = myList[i];
                    break;
                }
            }
        }
        if(targetNum == 0) {
            return "该数组中元素无任一元素出现次数超过元素长度的一半";
        } else {
            return "该数组中元素出现次数超过数组长度一半的元素是：" + Integer.toString(targetNum);
        }
    }

    public static ArrayList insertSort(int[] myList) {
        for (int j=1; j<myList.length; j++) {
            // 即将被抓取,位于桌面上的牌,即需要被插入的
            int key = myList[j];
            // 定义手上已经存在的牌的数量，便于索引比较
            int i = j - 1;
            // 将抓取的牌与手中的牌逐个比较，若存在比抽取的牌大的，则替换位置
            // 调换位置，升序排列，大的往后挪
            //while(i >= 0 && myList[i] > key) {
            // 调换位置，降序排列，小的往后挪
            while(i >= 0 && myList[i] < key) {
                // 调换位置，降序排列，小的往后挪
                myList[i+1] = myList[i];
                // 需要比较的次数随着每次比较后减少一次
                i = i - 1;
            }
            // 将手中的牌都排好序后即找到了抽取的牌需要插入的位置后，再将抓取的牌插入到正确的位置
            myList[i+1] = key;
        }
        ArrayList A = new ArrayList();
        for (int i:myList) {
            A.add(i);
        }
        return A;
    }

    public List<List<String>> groupAnagrams (String[] args) {
        List<String> sublist = new ArrayList<>();
        List<List<String>> finalList = new ArrayList<>();
        return finalList;
    }

    public static void main(String[] args) {
//        int[] list = new int[]{1,1,4,1,2,1,6,1,2,1};
//        int[] list = new int[]{4,2,6,2,1,1,1,1,1,1};
//        int[] list = new int[]{};
        int[] list = new int[]{5,2,4,6,1,3,8,7,10,9};
//        System.out.println(LeetCodeAlgorithmSets.findNumGreaterThanListLengthUseDoubleFor(list));
//        System.out.println(LeetCodeAlgorithmSets.insertSort(list));
//        int[] alist = new int[]{4,57,87,3,5,68,9,4,5,5,54,68,21};
        System.out.println(LeetCodeAlgorithmSets.insertSort(list));
    }
}
