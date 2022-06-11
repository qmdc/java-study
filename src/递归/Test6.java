package 递归;//递归选择排序

public class Test6 {
    public static void main(String[] args){
        int[] sorts=new int[10];
        for(int i=0;i<10;i++){
            sorts[i]=(int)(Math.random()*100);
        }
        for(int k:sorts){
            System.out.print(k+" ");
        }
        sort(sorts);
        System.out.println();
        for(int k:sorts){
            System.out.print(k+" ");
        }
    }
    public static void sort(int[] sorts){
        sort(sorts,0,sorts.length);
    }

    private static void sort(int[] sorts,int low,int high){
        if(low<high){
            int i=low;
            int min=sorts[low];
            for(int j=low+1;j<high;j++){
                if(sorts[j]<min){
                    min=sorts[j];
                    i=j;
                }
            }
            sorts[i]=sorts[low];
            sorts[low]=min;
            sort(sorts,low+1,high);
        }
    }
}
