package problems;

public class TwoSum {
    public static void main (String[] args){
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int pair = 0;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++) {
                // Two Sum (basic)
                if (arr[i] + arr[j] == target) {
                    // Print all pairs with sum
                    System.out.println(arr[i] + " + " + arr[j]);
                    pair++; // Count pairs with sum
                    found = true;
                }
            }
        }
        // Check if pair exists
        if(found){
            System.out.println(pair + " pair(s) exists.");
        }
        else{
            System.out.println("No pair found.");
        }
    }
}

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{};
//    }
//}
