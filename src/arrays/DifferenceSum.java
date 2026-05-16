package arrays;

public class DifferenceSum {
    public static void main (String[] args){
        int[] arr = {2, 7, 15, 11};
        int target = 9;
        int pair = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                if(Math.abs(arr[i] - arr[j]) == target){
                    System.out.println(arr[j] + " - " + arr[i]);
                    pair++;   //  || arr[j] - arr[i] == target
                }
            }
        }
        System.out.println(pair + " pair(s) Found");
    }
}
