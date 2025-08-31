package Array.Easy;

//--- code  1 naive Approach   when array is sorted  and no duplicates 
// class SecondLargestElementInAnArrayWithoutSorting {
// 	static private void getElements(int[] arr, int n) {
// 		if (n == 0 || n == 1) {            ///----edge-case
// 			System.out.print(-1);
// 			System.out.print(" ");
// 			System.out.print(-1);
// 			System.out.print("\n");
// 		}
// 		Arrays.sort(arr);
// 		int small = arr[1];
// 		int large = arr[n - 2];
// 		System.out.println("Second smallest is " + small);
// 		System.out.println("Second largest is " + large);
// 	}

// 	public static void main(String[] args) {
// 		int[] arr = { 1, 2, 4, 6, 7, 5 };
// 		int n = arr.length;
// 		getElements(arr, n);
// 	}
// }

//  TC- O(nlogn) = for sorting array and  SC- O(1) 

//--- code 2 better Approach ---
// class SecondLargestElementInAnArrayWithoutSorting {
// 	static private void getElements(int[] arr, int n) {
// 		if (n == 0 || n == 1) {   	  ///----edge-case
// 			System.out.print(-1);
// 			System.out.print(" ");
// 			System.out.print(-1);
// 			System.out.print("\n");
// 		}
// 		int small = Integer.MAX_VALUE;
// 		int second_small = Integer.MAX_VALUE;
// 		int large = Integer.MIN_VALUE;
// 		int second_large = Integer.MIN_VALUE;
// 		int i;
// 		for (i = 0; i < n; i++) {
// 			small = Math.min(small, arr[i]);
// 			large = Math.max(large, arr[i]);
// 		}
// 		for (i = 0; i < n; i++) {
// 			if (arr[i] < second_small && arr[i] != small) {
// 				second_small = arr[i];
// 			}
// 			if (arr[i] > second_large && arr[i] != large) {
// 				second_large = arr[i];
// 			}
// 		}

// 		System.out.println("Second smallest is " + second_small);
// 		System.out.println("Second largest is " + second_large);
// 	}

// 	public static void main(String[] args) {
// 		int[] arr = { 1, 2, 4, 6, 7, 5 };
// 		int n = arr.length;
// 		getElements(arr, n);
// 	}
// }

// TC- O(n) = for traversing array and  SC- O(1)




//--- code 3 optimal Approach -unsorted-array --noduplicates
class SecondLargestElementInAnArrayWithoutSorting {
	static private int secondSmallest(int[] arr, int n) {
		if (n < 2) {
			return -1;
		}
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] < small) {
				second_small = small;
				small = arr[i];
			} else if (arr[i] < second_small && arr[i] != small) {
				second_small = arr[i];
			}
		}
		return second_small;
	}

	static private int secondLargest(int[] arr, int n) {
		if (n < 2)
			return -1;
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] > large) {
				second_large = large;
				large = arr[i];
			}

			else if (arr[i] > second_large && arr[i] != large) {
				second_large = arr[i];
			}
		}
		return second_large;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7, 7, 5 };
		int n = arr.length;
		int sS = secondSmallest(arr, n);
		int sL = secondLargest(arr, n);
		System.out.println("Second smallest is " + sS);
		System.out.println("Second largest is " + sL);
	}

}

// TC- O(n) = for traversing array and  SC- O(1)
