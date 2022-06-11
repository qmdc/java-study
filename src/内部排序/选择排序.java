package 内部排序;

public class 选择排序 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=(int)(10+Math.random()*90);//产生10-100之间的随机数
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");

        //选择排序
        for (int i = 0; i < a.length-1; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                // 记录目前能找到的最小值元素的下标
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if (i!=min) {
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
