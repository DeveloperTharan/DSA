package DSA.Algorithms.SearchingAlgo;

public class Searching_Algo {
    //Linear Search
    public static int find(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;  
    }
    public static boolean contains(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static int find(String str, char target){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    public static boolean contains(String str, char target){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    public static int[] find(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    //Binary Search
    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        if(arr[start]<arr[end]){
            while(start<=end){
                int mid = (start+end)/2;
                if(target>arr[mid]){
                start = mid + 1;
                }
                else if(target<arr[mid]){
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
        }
        if(arr[start]>arr[end]){
            while(start<=end){
                int mid = (start+end)/2;
                if(target<arr[mid]){
                    start = mid + 1;
                }
                else if(target>arr[mid]){
                    end = mid - 1;
                }
                 else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
