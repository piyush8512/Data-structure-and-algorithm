class Number1Bits {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1); 
            n >>>= 1; 
        }

        return count;
    }
}

//tc: O(log n) where n is the input number, since we are iterating through the bits of the number.
//sc: O(1) since we are using a constant amount of space to store the