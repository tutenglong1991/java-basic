package classic.algorithm;

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

    public static void main(String[] args) {
        Integer[] a = {12,11};
        CommonSortMethods.insertMethod(a);
    }

}
