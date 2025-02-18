public class Subsets {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}; // массив
        printSubsets(subsets(nums1));
    }

    public static int[][] subsets(int[] nums) {
        int totalSubsets = 1 << nums.length;
        int[][] result = new int[totalSubsets][];

        for (int i = 0; i < totalSubsets; i++) {
            result[i] = new int[Integer.bitCount(i)];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    result[i][index++] = nums[j];
                }
            }
        }

        return result;
    }

    public static void printSubsets(int[][] subsets) {
        System.out.print("[");
        for (int i = 0; i < subsets.length; i++) {
            System.out.print("[");
            for (int j = 0; j < subsets[i].length; j++) {
                System.out.print(subsets[i][j]);
                if (j < subsets[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i < subsets.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}