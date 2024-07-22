package main;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] mergedArray = new int[length1 + length2];

        // Copy elements from nums1
        System.arraycopy(nums1, 0, mergedArray, 0, length1);
        // Copy elements from nums2
        System.arraycopy(nums2, 0, mergedArray, length1, length2);

        // Sort the merged array
        Arrays.sort(mergedArray);

        if (mergedArray.length % 2 == 0) {
            //the length is even

            return (double) (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2]) / 2;
        } else {
            //the length is uneven
            return mergedArray[mergedArray.length / 2];
        }
    }
}


//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
//
//
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
