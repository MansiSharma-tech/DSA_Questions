class OddStringDifference {
    public String oddString(String[] words) {//"adc","wzy","abc",  a=97,b=98,c=99, d=100
        Map<String,Integer> map = new HashMap<>();
        for(int j=0; j<words.length; j++){//3
            StringBuilder sb = new StringBuilder();
            for(int i=1; i<words[j].length();i++){//3,
                int a = words[j].charAt(i) - 'a';//3,2
                int b = words[j].charAt(i-1) - 'a';//0,3
                sb.append(a-b);//3,-1
                map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
            }
        }
        String reqVal = "";
        for(String s : map.keySet()){
            if(map.get(s)==1){
                reqVal = s;
                break;
            }
        }
        for(int j=0; j<words.length; j++){
            StringBuilder sb = new StringBuilder();
            for(int i=1; i<words[j].length();i++){
                int a = words[j].charAt(i) - 'a';
                int b = words[j].charAt(i-1) - 'a';
                sb.append(a-b);
                if(reqVal.equals(sb.toString())){
                    return words[j];
                }
            }
        }
        return "Hi";
        
    }
}