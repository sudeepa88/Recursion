package java_recursion;

public class maxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brr[]= {5,9,3,7,8,10};
		int j=brr.length-1;
		largestElement(brr,j);
		System.out.println("The maximum item in the array is "+largestElement(brr,j));

	}
	
	public static int largestElement(int arr[],int n) {
		if(n==0) {
			int maxElement=arr[0];
			return maxElement;
		}else {
		int maxElement=((largestElement(arr,n-1))<arr[n]) ? (maxElement=arr[n]):(maxElement=largestElement(arr,n-1));
		return maxElement;
		}
		
}

	}


