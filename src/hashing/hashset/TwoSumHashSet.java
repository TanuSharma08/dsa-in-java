package hashing.hashset;

import java.util.HashSet;
public class TwoSumHashSet {
    public static void main (String[] args){
        int[] arr = {2, 7, 15, 11};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            int needed = target - current;

            if(set.contains(needed)){
                System.out.println("Pair: " + current + " + " + needed);
                return;
            }
            set.add(current);
        }
        System.out.println("No pairs found.");
    }
}