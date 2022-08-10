import java.util.Arrays;


public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		
		int[] nums1 = {2,3};
		int[] nums2 = {1};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));
		
	}
	
	public static Double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
		
			double[] nums = new double[nums1.length + nums2.length];
			
			for(int i = 0; i < nums1.length; i++) {
				
				if(i++ == nums1.length) {
					
					for(int r = 0; r < nums2.length; i++) {
						
						nums[nums1.length + r] = nums2[r];
						
					} 
					
				} else {
					
					nums[i] = nums1[i];
					
				}
				
			}
			
			
			
			
			
			Arrays.sort(nums);
		
			
			if(nums.length % 2 == 0 ) {
				
				System.out.println("here");
				return Double.valueOf((nums[(nums.length - 1) / 2] + nums[((nums.length - 1)/ 2) + 1] ) / 2);
				
			} else {
				System.out.println("nah here");
				return (double) nums[nums.length / 2];
				
			}
			
    }
}
