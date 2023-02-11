class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int cLines = 1;
        int cChCurrentLine = 0;
         
        for (int i = 0; i < S.length(); i++)
        {
            char c = S.charAt(i);
            cChCurrentLine += widths[c - 'a'];
            if (cChCurrentLine > 100)
            {
                cLines++;
                cChCurrentLine = widths[c - 'a'];
            }
        }
         
        int[] ans = new int[2];
        ans[0] = cLines;
        ans[1] = cChCurrentLine;
         
        return ans;
    }
}