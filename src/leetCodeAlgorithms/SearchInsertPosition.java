package leetCodeAlgorithms;

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return
// the index where it would be if it were inserted in order. You must write an algorithm with O(log n) runtime complexity.

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length;

        while (begin < end) {
            int mid = (begin + end) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                begin = mid + 1;
            } else end = mid;
        }

        return begin;
    }

}
