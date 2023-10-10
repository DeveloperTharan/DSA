package DSA.Algorithms.SearchingAlgo; 

import java.util.Arrays;

public class DemoFor_Searching_Algo{
    public static void main(String[] args) {
        //Linear search
        int [] arr = {1,2,3,4,5,6,7,8,9};
        //int [] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Searching_Algo.find(arr,1));
        System.out.println(Searching_Algo.contains(arr,1)); 
        
        String name = "DHARANITHARAN";
        System.out.println(Searching_Algo.find(name,'N'));
        System.out.println(Searching_Algo.contains(name, 'I'));

        int[][] twoD_arr = {{1,2,3},
                            {4,5,6},
                            {7,8,9,0}};
        int[] ans = Searching_Algo.find(twoD_arr, 0);
        System.out.println(Arrays.toString(ans));

        //Binary search
        System.out.println(Searching_Algo.search(arr, 6));
    }
}