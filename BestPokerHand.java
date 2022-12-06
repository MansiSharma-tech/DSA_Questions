class BestPokerHand {
    public String bestHand(int[] ranks, char[] suits) {
        boolean pair=false;
        HashMap<Integer, Integer> rank = new HashMap<>();
        HashMap<Character, Integer> suit = new HashMap<>();

        for(int i : ranks)
        {
             rank.put(i,rank.getOrDefault(i,0)+1);

        }

        for(char i : suits)
        {
             suit.put(i,suit.getOrDefault(i,0)+1);

        }
        if(suit.size()==1)
        return "Flush";
        
        for(int i : rank.values())
        {
            if(i>=3)
            {
                return "Three of a Kind";
            }
            if(i>=2)
            {
                pair = true;;
            }
        }
        if(pair==true)
        return "Pair";
        return "High Card";

    }
}