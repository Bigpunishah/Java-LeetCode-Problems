import java.util.*;

class Main {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Step 1: Create two sets 'set1' and 'set2' of all integers in nums1 and nums2, respectively.
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        // Step 2: Create two sets 'diff1' and 'diff2' of integers which are in set1 and not in set2,
        // and integers which are in set2 and not in set1, respectively.
        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);

        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);

        // Step 3: Convert 'diff1' and 'diff2' to lists and return them as answer[0] and answer[1], respectively.
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(diff1));
        answer.add(new ArrayList<>(diff2));

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {3, 4, 5, 6, 7};

        List<List<Integer>> answer = findDifference(nums1, nums2);

        System.out.println(answer.get(0)); // [1, 2]
        System.out.println(answer.get(1)); // [6, 7]
    }
}