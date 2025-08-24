package Array.Easy;

// ---------code--brute force approach--sorting
// public class FindTheLargestElementInAnArray {

//   public static void main(String args[]) {

//     int arr1[] =  {2,5,1,3,0};
//     System.out.println("The Largest element in the array is: " + sort(arr1));
//   }
//   static int sort(int arr[]) {
//     // inbuit sorting algo quicksort two pointer
//     Arrays.sort(arr);
//     return arr[arr.length - 1];
//   }
// }
// ---------code

// Time Complexity: O(N*log(N))  avg case and best case 
//                          O(n²) worst case

// Space Complexity: O(n) worst case   becosue of using stack
//                            O(log n) avg case

//--code ----optimal approach--reursive approach
public class FindTheLargestElementInAnArray {
  public static void main(String args[]) {

    int arr1[] = { 2, 5, 1, 3, 0 };
    System.out.println("The Largest element in the array is: " + findLargestElement(arr1));
  }

  static int findLargestElement(int arr[]) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}

// Time Complexity:
// Best: O(n) (if already sorted)
// Average: O(n log n)
// Worst: O(n log n) (guaranteed unlike quicksort)

// Space Complexity: O(1)
