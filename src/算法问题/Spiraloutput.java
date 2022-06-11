package 算法问题;

import java.util.ArrayList;

public class Spiraloutput {
    public static void main(String[] args) {
        int[][] targer= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] use={{0,0,0},{0,0,0},{0,0,0}};
        int[][] des={{0,1},{1,0},{0,-1},{-1,0}};
        int num=targer.length*targer[0].length;
        int col=0,row=0,index=0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            arr.add(targer[row][col]);
            use[row][col]=1;
            int nextRow=row+des[index][0];
            int nextCol=col+des[index][1];

            if (nextCol<0||nextCol>=targer[0].length||nextRow>=targer.length||use[nextRow][nextCol]==1) {
                index=(index+1)%4;
            }
            row+=des[index][0];
            col+=des[index][1];
        }

        for(Integer i:arr){
            System.out.println(i);
        }
    }
}
