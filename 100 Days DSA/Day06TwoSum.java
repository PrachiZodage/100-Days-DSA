import java.util.Arrays;

public class Day06TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Day06TwoSum solution = new Day06TwoSum();

        int nums1[] = { 2, 7, 11, 15 };
        int target1 = 9;

        int nums2[] = { 3, 2, 4 };
        int target2 = 6;

        int nums3[] = { 3, 3 };
        int target3 = 6;

        System.out.println("Input: " + Arrays.toString(nums1) + " Target: " + target1);
        System.out.println("Output: " + Arrays.toString(solution.twoSum(nums1, target1)));

        System.out.println("Input: " + Arrays.toString(nums2) + " Target: " + target2);
        System.out.println("Output: " + Arrays.toString(solution.twoSum(nums2, target2)));

        System.out.println("Input: " + Arrays.toString(nums3) + " Target: " + target3);
        System.out.println("Output: " + Arrays.toString(solution.twoSum(nums3, target3)));
    }
}
