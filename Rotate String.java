class RotateString {
    public boolean rotateString(String s, String goal) {
        String tmp=s+s;
        
        for(int i=0;i<=tmp.length()-s.length();i++)
        {
            String substring=tmp.substring(i,i+s.length());
            if(substring.equals(goal))
                return true;
        }
        return false;
    }
}