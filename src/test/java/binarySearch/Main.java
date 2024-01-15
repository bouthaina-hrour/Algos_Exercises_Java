package binarySearch;

public class Main {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;


        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }
    private static int findLargestPower(int x) {
        int resultP = 1;

        for (int b = 2; b <= Math.sqrt(x); b++) {
            int p = 2;

            while (Math.pow(b, p) <= x) {
                if (Math.pow(b, p) == x) {
                    resultP = p;
                }
                p = p + 1;
            }
            if(resultP!=1) return resultP;
        }

        return resultP;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 3, 5, 6}, 7));
        System.out.println(findLargestPower(81));
    }
}
