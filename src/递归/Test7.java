package 递归;//递归二分查找

public class Test7 {
    public static void main(String[] args){
        int[] sorts=new int[50];
        for(int i=0;i<50;i++){
            sorts[i]=i;
        }
        for(int k:sorts){
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println(sort(sorts,10)+1);
    }
    public static int sort(int[] sorts,int key){
        return sort(sorts,key,0,sorts.length-1);
    }

    private static int sort(int[] sorts,int key,int low,int high){
            if(low>high)
                return -low-1;
            int mid=low+(high-low)/2;

            if(sorts[mid]==key)
                return mid;
            else if(sorts[mid]<key)
                return sort(sorts,key,mid+1,high);
            else
                return sort(sorts,key,low,mid-1);
    }
}
