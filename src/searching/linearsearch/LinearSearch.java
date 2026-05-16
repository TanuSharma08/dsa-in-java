package searching.linearsearch;

public class LinearSearch {
    public static void main (String[] args){
        int[] arr = {10, 30, 22, 45, 98};
        int search = 19;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
