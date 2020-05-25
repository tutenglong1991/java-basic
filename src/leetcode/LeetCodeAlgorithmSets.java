package leetcode;


public class  LeetCodeAlgorithmSets{

    public static void main(String[] args) {
//        int[] list = new int[]{1,1,4,1,2,1,6,1,2,1};
//        int[] list = new int[]{4,2,6,2,1,1,1,1,1,1};
//        int[] list = new int[]{};
        int[] list = new int[]{1,2,3};
        System.out.println(LeetCodeAlgorithmSets.findNumGreaterThanListLengthUseDoubleFor(list));
    }
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
}
