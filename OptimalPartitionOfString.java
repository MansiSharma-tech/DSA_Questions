class OptimalPartitionOfString {
	public int partitionString(String s) {
		int res=0;
		HashSet<Character> set = new HashSet<>();
		for(int i=0; i<s.length(); ++i){
			if(set.contains(s.charAt(i))){
				res ++; 
				set.clear();
			}
			set.add(s.charAt(i));
		}
		return set.size() == 0? res : res+1;
}