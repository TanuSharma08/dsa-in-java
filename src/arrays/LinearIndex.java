package arrays;

public class LinearIndex {
    public static void main (String[] args){
        int[] arr = {10, 30, 22, 45, 98};
        int search = 30;
        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}
