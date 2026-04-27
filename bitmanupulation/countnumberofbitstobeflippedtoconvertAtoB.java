// public class countnumberofbitstobeflippedtoconvertAtoB{

// }


 class countnumberofbitstobeflippedtoconvertAtoB {
    public int minBitsFlip(int start, int goal) {
        int num = start ^ goal;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (num & 1); 

            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int start = 10, goal = 7;
        countnumberofbitstobeflippedtoconvertAtoB sol = new countnumberofbitstobeflippedtoconvertAtoB(); 
        int ans = sol.minBitsFlip(start, goal);
        
        System.out.println("The minimum bit flips to convert number is: " + ans);
    }
}


// tc: O(1) since we are only iterating through a fixed number of bits (32 bits for integers)
// sc: O(1) as we are using a constant amount of space for counting and storing the XOR result