class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
     String arr[] = s.split(" ");
     int count = arr[arr.length-1].length();
     return count;
    }
}