package miscellaneous_problems.Median;
import java.util.Arrays;

public class Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int totalLength = l1 + l2;
        int[] nums3 = new int[totalLength];
        System.arraycopy(nums1, 0, nums3, 0, l1);
        System.arraycopy(nums2, 0, nums3, l1, l2);
        Arrays.sort(nums3);
        int avg = totalLength / 2;
        if (totalLength % 2 != 0){
            return nums3[avg];
        }else{
            return ((double)(nums3[avg-1] + nums3[avg]) / 2);
        }
    }
}
