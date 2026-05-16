package arrays;

public class AddElement {
    public static void main (String[] args){
        int[] arr = {20, 5, 10, 50, 8};
        int add = 0;

        for(int i = 0; i< arr.length; i++){
            add += arr[i];
        }
        System.out.println("Addition of Elements: " + add);
    }
}
