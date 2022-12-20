class MaximumValueOfAStringInAnArray {
    public int maximumValue(String[] strs) {
        int maximum=0;
        for(int i=0; i<strs.length; i++)
        {
            try{
                int m=Integer.parseInt(strs[i]);
                maximum=Math.max(m,maximum);
            }
            catch(NumberFormatException e){
                 int m1 = strs[i].length();
                 maximum=Math.max(m1,maximum);

            }
          
        }
        return maximum;
        
    }
}