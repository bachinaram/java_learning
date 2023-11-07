package corejava.leetcode.strings;

public class substring_kmp {
    public static int strStr(String haystack, String needle) {
        int hay_len = haystack.length();
        int ned_len = needle.length();

        if (ned_len == 0) {
            return 0; // An empty needle is always found at index 0.
        }

        if (hay_len == 0 && ned_len != 0) {
            return -1; // If haystack is empty and needle is not, needle cannot be found.
        }

        if (hay_len < ned_len) {
            return -1; // If haystack is shorter than needle, needle cannot be found.
        }

        int[] lps = computeLPSArray(needle);
        int i = 0; // Index for haystack
        int j = 0; // Index for needle

        while (i < hay_len) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == ned_len) {
                    return i - j; // Found the first occurrence of needle in haystack
                }
            } else if (j > 0) {
                j = lps[j - 1]; // Update j using the LPS array
            } else {
                i++;
            }
        }

        return -1; // Needle not found in haystack
    }

    private static int[] computeLPSArray(String needle) {
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        int[] lps = new int[needle.length()];
        lps[0] = 0;

        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int index = strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + index);
    }
}
