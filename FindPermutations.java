public class FindPermutations {
    // Find Permutations
    public static void findPermutations(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for (int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(newStr, ans+curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutations(str, "");
    }
}
