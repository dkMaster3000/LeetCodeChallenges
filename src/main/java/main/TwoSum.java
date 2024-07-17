package main;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

//    public static int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//
//        return null;
//    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }

            map.put(target - nums[i], i);

        }

        return null;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));

        int[] nums2 = new int[]{3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

        int[] nums3 = new int[]{3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3, target3)));

    }

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.
//
//
//
//            Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:
//
//    Input: nums = [3,3], target = 6
//    Output: [0,1]
}
