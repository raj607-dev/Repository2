import java.io.*;
import java.util.*;

public class Solution {

    public static void getSmallestAndLargest(String s, int k) {
        // Create a list to hold all the substrings of length k
        List<String> substrings = new ArrayList<>();
        
        // Extract all substrings of length k
        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add(s.substring(i, i + k));
        }
        
        // Sort the substrings lexicographically
        Collections.sort(substrings);
        
        // Output the smallest and largest substrings
        System.out.println(substrings.get(0));  // Lexicographically smallest
        System.out.println(substrings.get(substrings.size() - 1));  // Lexicographically largest
    }

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  // Read the string s
        int k = sc.nextInt();  // Read the integer k
        sc.close();
        
        // Call the function to get the smallest and largest substrings
        getSmallestAndLargest(s, k);
    }
}
