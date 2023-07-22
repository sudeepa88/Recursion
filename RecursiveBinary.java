package java_recursion;

public class RecursiveBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brr[]= {1,2,3,4,5,7,8,9,10,11,12};
		int si=0;int ei=brr.length-1;
		System.out.println("The Element which we are searching for is in position "+binarySearch(brr,1,si,ei));

	}
	
	public static int binarySearch(int[] arr, int ele,int startingIndex, int endingIndex) {
		 int mid=(startingIndex+endingIndex)/2;
		if(arr[mid]==ele) {
			return mid;
		}
		else if(arr[mid]>ele){
			return binarySearch(arr,ele,startingIndex,mid-1);
			
		}else {
			return binarySearch(arr,ele,mid+1,endingIndex);
		}
		
		//return -1;
		
	}

}
