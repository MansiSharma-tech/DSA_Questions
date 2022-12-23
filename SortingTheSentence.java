class SortingTheSentence {
    public String sortSentence(String s) {
       String temp = "";
        String[] words = s.split(" ");
        Map<Integer, String> sentence = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char num = words[i].charAt(words[i].length()-1);
            int number = Integer.parseInt(String.valueOf(num));
sentence.put(number, words[i].substring(0, words[i].length()-1));
        }
        for (Map.Entry<Integer, String> entry : sentence.entrySet()) {
           temp += entry.getValue() + " ";
        }
        return temp.trim();
    }
}