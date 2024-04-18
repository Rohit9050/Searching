
// Linear Search Program 
public class LinearSearch{
  public static void main(String[] args){
    int[] arr = {10,14,17,19,23,56,78,-1};
    int target = -1;
    int result = linearSearch(arr, target);
    if(result!=-1){
      System.out.println("Element found at index : " + result );
    }
    else{
      System.out.println("Element not found :");
    }
  }

  public static int linearSearch(int[] arr, int target){
    for(int i = 0; i<arr.length; i++){
      if(arr[i] == target){
        return i; 
      }
    }
    return -1;
  }
}



// Linear Search by taking user input.

import java.util.Scanner;
public class LinearSearch{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i<size; i++){
      System.out.println("Enter the value at index : " + i);
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target value : ");
    int target = sc.nextInt();
    int result = linearSearch(arr, target);
    if(result!=-1){
      System.out.println("Element found at index : " + result );
    }
    else{
      System.out.println("Element not found :");
    }
  }
  public static int linearSearch(int[] arr, int target){
    for(int i = 0; i<arr.length; i++){
      if(arr[i] == target){
        return i; 
      }
    }
    return -1;
  }
}