package leetCodeAlgorithms;

public class LargestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String longestPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String currentString = strs[i];
            int j = 0;
            while (j < longestPrefix.length() && j < currentString.length() && longestPrefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            longestPrefix = currentString.substring(0, j);

            if (j == 0) {
                longestPrefix = "";
                break;
            }

        }
        return longestPrefix;

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flow", "overflow", "openflow"})); //This case doesn't work
    }

}
