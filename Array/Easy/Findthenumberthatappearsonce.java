
// //bruteforce approach
// class Findthenumberthatappearsonce {
//     public int getSingleElement(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             int num = arr[i];
//             int count = 0;
//             for (int j = 0; j < n; j++) {
//                 if (arr[j] == num)
//                     count++;
//             }
//             if (count == 1) return num;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 1, 2, 1, 2};
//         Findthenumberthatappearsonce obj = new Findthenumberthatappearsonce();
//         int ans = obj.getSingleElement(arr);

//         System.out.println("The single element is: " + ans);
//     }
// }

// //tc: O(n^2)
// //sc: O(1)


//bettercase
// class Findthenumberthatappearsonce {
//     public int getSingleElement(int[] arr) {
//         int n = arr.length;
//         int maxi = arr[0];
//         for (int i = 0; i < n; i++) {
//             maxi = Math.max(maxi, arr[i]);
//         }
//         int[] hash = new int[maxi + 1];
//         for (int i = 0; i < n; i++) {
//             hash[arr[i]]++;
//         }
//         for (int i = 0; i < n; i++) {   
//             if (hash[arr[i]] == 1)
//                 return arr[i];
//         }
//         return -1; 
//     }

//     public static void main(String[] args) {
//         int[] arr = { 4, 1, 2, 1, 2 };
//         Findthenumberthatappearsonce obj = new Findthenumberthatappearsonce();
//         int ans = obj.getSingleElement(arr);
//         System.out.println("The single element is: " + ans);
//     }
// }

// // tc: O(N)+O(N)+O(N), 
// // sc: O(n)





// class Solution {
//     // Function to find the element that appears once using XOR
//     public int getSingleElement(int[] arr) {
//         int xorr = 0;

//         // XOR all elements — duplicates cancel each other out
//         for (int num : arr) {
//             xorr ^= num;
//         }

//         return xorr;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 1, 2, 1, 2};

//         Solution obj = new Solution();
//         int ans = obj.getSingleElement(arr);
//         System.out.println("The single element is: " + ans);
//     }
// }