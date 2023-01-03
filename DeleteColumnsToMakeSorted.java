class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int index = 0;
        int auxIndex = 0;
        int count = 0;
        char m = ' ';
        for (int i = 0; i < strs[0].length(); i++) {
            m = strs[0].charAt(index);
            for (int j = 0; j < strs.length; j++) {
                if (!(m <= strs[j].charAt(auxIndex))) {
                    count++;
                    break;
                }
                m = strs[j].charAt(auxIndex);
            }
            index++;
            auxIndex++;
        }
        return count;
    }
}