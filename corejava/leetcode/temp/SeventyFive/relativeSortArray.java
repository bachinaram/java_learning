package leetcode.temp.SeventyFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class relativeSortArray {
    public static int[] relativeSort(int[] arr1, int[] arr2) {
        int[] output = new int[arr1.length];
        ArrayList<Integer> temp = new ArrayList<>();
        HashMap<Integer, Integer> check = new HashMap<>();
        int k=0;
        int pointer =0;
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    if(check.containsKey(arr1[i])){
                        check.put(arr1[i],check.get(arr1[i])+1);
                        break;
                    }
                    else{
                        check.put(arr1[i],1);
                        break;
                    }
                }
                if(j==arr2.length-1){
                    temp.add(arr1[i]);
                }
            }
        }
        Collections.sort(temp);
        //2,45,66

        for(int j=0;j<arr2.length;j++){
            int t = check.get(arr2[j]);
                while(t>0){
                    output[k] = arr2[j];
                    k++;
                    t--;
                }
        }
        for(int i=0;i<temp.size();i++){
            output[k] = temp.get(i);
            k++;
        }
        return output;

    }
    public static void main(String[] args){
        //int[] arr1 = {28,6,22,8,44,17};
        //int[] arr2 = {22,28,8,6};
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] result = relativeSort(arr1,arr2);

        for(int h=0;h<result.length;h++){
            System.out.print(result[h]);
        }

    }
}
/*
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

 

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

Example 2:

Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]

 

Constraints:

    1 <= arr1.length, arr2.length <= 1000
    0 <= arr1[i], arr2[i] <= 1000
    All the elements of arr2 are distinct.
    Each arr2[i] is in arr1.


 */
