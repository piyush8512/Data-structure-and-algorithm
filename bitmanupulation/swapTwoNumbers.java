// package bitmanupulation;

// public class swapTwoNumbers {
    
// }

class Swapper {
    public void swapXOR(int[] arr) {
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }
}

public class swapTwoNumbers {
    public static void main(String[] args) {
        int[] nums = {5, 10};
        Swapper swapper = new Swapper();
        swapper.swapXOR(nums); 
        System.out.println("a = " + nums[0] + ", b = " + nums[1]);
    }
}
//o(1) time complexity and o(1) space complexity