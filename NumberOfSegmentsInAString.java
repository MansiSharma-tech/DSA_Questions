class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        String[] s1 = s.split(" ");
        int len = 0;
        for(int i=0;i<s1.length;i++){
            if(!s1[i].equals("")){
                len++;
            }
        }
        
        return len;
    }
}