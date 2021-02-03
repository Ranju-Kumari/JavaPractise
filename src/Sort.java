
public class Sort {

	public static void main(String []a) {
		
		int nums [] = {0,1,2};
		sort(nums);
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
	}
	
	public static void sort(int nums[]) {
		
		int low = 0; 
		int mid =0;
		int high =nums.length-1;
		
		
		
		for(int i =0;i<nums.length;i++) {
			
			switch(nums[mid]) {
			
			case 0:
				
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid]= temp;
				low++;mid++;
				System.err.println(low);
				break;
				
			case 2:
				int temp2 = nums[high];
				nums[high] = nums[mid];
				nums[mid]= temp2;
				high--;
				System.err.println(low);
				break;
				
			case 1:
				mid++;
				System.err.println(low);
				break;
			
			}
		}
	}
}
