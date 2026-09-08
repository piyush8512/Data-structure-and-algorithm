import java.util.HashMap;
public class nonrepeatedcharactersfromastringusingHashMap {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print non-repeated characters
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1)  System.out.print(ch + " ");
        }
    }
    
}
