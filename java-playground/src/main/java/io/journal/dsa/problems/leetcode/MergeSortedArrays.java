package io.journal.dsa.problems.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m - 1;
        int r2 = n - 1;

        for (int w = m + n - 1; w >= 0; w--) {
            if (r1 >= 0 && r2 >= 0) {
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            } else if (r1 >= 0) {
                nums1[w] = nums1[r1--];
            } else {
                nums1[w] = nums2[r2--];
            }
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m - 1;
        int r2 = n - 1;
        int w = m + n - 1;

        while (r2 >= 0) {
            if (r1 >= 0 && nums1[r1] > nums2[r2]) {
                nums1[w--] = nums1[r1--];
            } else {
                nums1[w--] = nums2[r2--];
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArrays merger = new MergeSortedArrays();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merger.merge3(nums1, m, nums2, n);

        // Print the merged array (nums1)
        for (int num : nums1) {
            System.out.print(num + " ");
        }


        Math.floor(1.0);
    }
}


/*

```
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
```
```
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
```

```
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
```
```
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.```


*/