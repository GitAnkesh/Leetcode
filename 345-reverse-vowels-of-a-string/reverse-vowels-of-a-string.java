class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int li = 0;
        int ri = s.length() - 1;

        while (li < ri) {
            while (li < ri && !isVowel(arr[li])) {
                li++;
            }

            while (li < ri && !isVowel(arr[ri])) {
                ri--;
            }

            if (li < ri) {
                char temp = arr[li];
                arr[li] = arr[ri];
                arr[ri] = temp;
                li++;
                ri--;
            }
        }

        return new String(arr);
    }

    boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}