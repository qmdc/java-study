package 内部排序;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=(int)(10+Math.random()*90);//产生10-100之间的随机数
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");

        //冒泡排序
        for (int i = a.length-1; i > 0; i--) {
            boolean flag=true;// 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成
            for (int j = 0; j < i; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=false;
                }
            }
            if (flag) {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
