package 内部排序;

public class 归并排序 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=(int)(10+Math.random()*90);//产生10-100之间的随机数
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");

        MergeSort(a,0,a.length-1);//归并排序

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void MergeSort(int[] a,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            MergeSort(a,low,mid);
            MergeSort(a,mid+1,high);
            Merge(a,low,mid,high);
        }
    }

    public static void Merge(int[] a,int low,int mid,int high){
        int[] temp=new int[a.length];

        int i=low,j=mid+1,k=low;
        while (i<=mid&&j<=high) {
            if(a[i]<a[j]){temp[k]=a[i];i++;}
            else{temp[k]=a[j];j++;}
            k++;
        }
        while (i<=mid) {temp[k]=a[i];i++;k++;}
        while (j<=high) {temp[k]=a[j];j++;k++;}

        for (int i1 : temp) {
            System.out.print(i1+" ");
        }
        System.out.print('\n');

        for (int e = low; e <= high; e++) {
            a[e]=temp[e];
        }
    }
}
