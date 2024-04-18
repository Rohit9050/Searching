// Binary Search  complexity is O(n(logn))
// Binary Search 
// Binary Search needs sorted array 

public class BinarySearch{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7,8,9};
    int target = 8;
    int result = binarySearch(arr, target);
    if(result!=-1){
      System.out.println("Element found at index : " + result );
    }
    else{
      System.out.println("Element not found :");
    }
  }
  public static int binarySearch(int[] arr, int target){
    int left = 0;
    int right = arr.length-1;
    while(left<=right){
      int mid = (left+right)/2;
      if(arr[mid] == target){
        return mid;
      }
      else if(arr[mid] < target){
         left = mid+1;
      }
      else{
        right = mid-1;
      }
    }
    return -1;
  }
}