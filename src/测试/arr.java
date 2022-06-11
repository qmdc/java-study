package 测试;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int[] arrs = {1, 2, 3, 4};
        test1(arrs);
        System.out.println("="+Arrays.toString(arrs));
    }

    public static void test1(int[] a){
        System.out.println("=="+Arrays.toString(a));
//        a= new int[]{1, 2, 3};
        a[2]++;
        System.out.println("==="+Arrays.toString(a));
    }
}
