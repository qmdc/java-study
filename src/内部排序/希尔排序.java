package 内部排序;

//希尔排序：希尔排序是基于插入排序而提出改进方法的
public class 希尔排序 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=(int)(10+Math.random()*90);//产生10-100之间的随机数
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");

        Shell_Sort(a,a.length);//希尔排序

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void Shell_Sort(int[] a,int n){
        int increment=n;//增量
        do{
            increment=increment/3+1;
            ShellPass(increment,n,a);
        }while (increment>1);
    }

    public static void ShellPass(int d,int n,int[] a){
        int j;
        for (int i=d;i<n;i++) {
            if (a[i] < a[i - d]) {
                int number = a[i];
                for (j = i - d; j >= 0 && a[j] > number; j -= d) {
                    a[j + d] = a[j];
                }
                a[j + d] = number;
            }
        }
    }
}










