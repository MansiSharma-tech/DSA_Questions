class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length, i = 0, j = 0, s = 0;
        while (i < len)
            if (s >= 0 && popped[j] == pushed[s]) {
                j++;
                s--;
            } else {
                s++;
                i++;
                if (i < len) pushed[s] = pushed[i];
            }
        return s == 0;
    }
}