package leetcode;

import java.util.HashSet;
import java.util.Map;

public class  LeetCodeAlgorithmSets{

    public static void main(String[] args) {
//        int[] list = new int[]{1,1,4,1,2,1,6,1,2,1};
//        int[] list = new int[]{4,2,6,2,1,1,1,1,1,1};
//        int[] list = new int[]{};
        int[] list = new int[]{1,2,3};
        System.out.println(LeetCodeAlgorithmSets.findNumGreaterThanListLengthUseDoubleFor(list));
    }
    //��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֣�
    //������Ŀ����Ŀ�д���һ���������������Ԫ��һ����ֻ����һ������Ϊ����������������ϵĻ�һ�������ܶ��������ȵ�һ�룬ֻ���ǵ���
    //��һ����Ҫ����Ϊ�ջ�ֻ��һ������������
    public static String findNumGreaterThanListLengthUseDoubleFor(int[] myList) {
        int targetNum = 0;
        if(myList.length == 0) {
            return "���鲻��Ϊ��";
        } else if(myList.length == 1){
            return "��������Ԫ�س��ִ����������鳤��һ���Ԫ���ǣ�" + Integer.toString(myList[0]);
        }else{
            for (int i = 0; i < myList.length - 1; i++) {
                int count = 1;
                for (int j = i + 1; j < myList.length; j++) { //�˴���Ҫע��j=i+1�Ĵ�������ֱ��д��j=1����Ϊ��������ѭ��ÿ�α�������ڶ���Ԫ�ص����һ��Ԫ��ȫ���Ա�һ��
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
            return "��������Ԫ������һԪ�س��ִ�������Ԫ�س��ȵ�һ��";
        } else {
            return "��������Ԫ�س��ִ����������鳤��һ���Ԫ���ǣ�" + Integer.toString(targetNum);
        }
    }
}
