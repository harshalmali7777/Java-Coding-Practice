package Array;

public class Array1 {
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,9,10,12};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println(sum);
	}

}
