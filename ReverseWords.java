class ReverseWords {
    public String reverseWords(String s) {//Mansi Sharma
        String[] arr = s.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            strBuilder.append(reverse(arr[i]));
            if (i != arr.length - 1) {
                strBuilder.append(" ");
            }
        }
        
        return strBuilder.toString();
    }
    
    private String reverse(String s) {
        char[] a = s.toCharArray();
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            swap(a, l++, r--);
        }
        
        return new String(a);
    }
    
    private void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}