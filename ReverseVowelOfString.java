class Solution {
   public String reverseVowels(String s) {//hello       
      	HashSet<Character> chars = new HashSet<Character>();
        chars.add('a'); chars.add('e'); chars.add('i'); chars.add('o'); chars.add('u');
        chars.add('A'); chars.add('E'); chars.add('I'); chars.add('O'); chars.add('U');
        int left = 0, right = s.length() - 1;  
        char[] sc = s.toCharArray();
        boolean leftVowel = false, rightVowel = false;
        while (left < right) {//0<4,1<4,2<3,3<2
            leftVowel = chars.contains(sc[left]);//lv=false,Lv=true,false
            rightVowel = chars.contains(sc[right]);// true, true,false
            
            if (leftVowel && rightVowel) {
                char swapper = sc[left];//
                sc[left++] = sc[right];//0,2
                sc[right--] = swapper;//3
            } else {
                right -= (rightVowel) ? 0 : 1;//4,2
                left += (leftVowel) ? 0 : 1;//1,3, 
            }
        }
            
        return String.valueOf(sc);
    }
}
