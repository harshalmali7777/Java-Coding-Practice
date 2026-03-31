package Array;

public class Array2 {

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,9,10,12,13};
		int max = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
