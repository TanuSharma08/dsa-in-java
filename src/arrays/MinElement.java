package arrays;

public class MinElement {
    public static void main (String[] args){
        int[] arr = {20,4,59,1,8};
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
