package 内部排序;

public class 插入排序 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=(int)(10+Math.random()*90);//产生10-100之间的随机数
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");

        Insertsort(a);//插入排序

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //插入排序
    public static void Insertsort(int[] a){
        for (int i = 1; i < a.length; i++) {
            int number=a[i];
            int j;
            for (j=i;j>0&&number<a[j-1];j--) {
                // 从已经排序的序列最右边的开始比较，找到比其小的数
                a[j]=a[j-1];
            }
            if (j!=i) {
                a[j]=number;
            }
        }
    }
}
