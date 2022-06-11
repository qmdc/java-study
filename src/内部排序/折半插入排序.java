package 内部排序;

public class 折半插入排序 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=(int)(10+Math.random()*90);//产生10-100之间的随机数
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");

        HalveInsertsort(a);//折半插入排序

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void HalveInsertsort(int[] a){
        for (int i = 1; i < a.length; i++) {
            int number=a[i];

            int low=0,high=i;
            while (low<=high) {
                int mid=low+(high-low)/2;
                if (number<a[mid]) {
                    high=mid-1;
                } else if (number>a[mid]) {
                    low=mid+1;
                }else{
                    low=mid;
                    break;
                }
            }

            int k;
            for(k=i;k>low;k--){
                a[k]=a[k-1];
            }

            a[k]=number;
        }
    }
}
