package arrays;

public class OddEven {
    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int even=0,odd=0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
    }
}
