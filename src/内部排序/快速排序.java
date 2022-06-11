package 内部排序;

//快速排序算是在冒泡排序基础上的递归分治法
public class 快速排序 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=(int)(10+Math.random()*90);//产生10-100之间的随机数
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");

        QKsort(a,0,a.length-1);

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void QKsort(int[] a,int low,int high){
        int pos;
        if(low<high){
            pos=QKpass(a,low,high);
            QKsort(a,low,pos-1);
            QKsort(a,pos+1,high);
        }
    }

    public static int QKpass(int[] a,int low,int high){
        int x=a[low];
        while (low<high) {
            while (low<high&&a[high]>x) {high--;}
            if (low<high) {a[low]=a[high];}

            while (low<high&&a[low]<x) {low++;}
            if (low<high) {a[high]=a[low];}
        }
        a[low]=x;
        return low;
    }
}
