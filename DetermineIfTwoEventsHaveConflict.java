class DetermineIfTwoEventsHaveConflict {
    public boolean haveConflict(String[] event1, String[] event2) {//["01:15","02:00"],
                                                                //event2 = ["02:00","03:00"]
        int c1 = event2[0].compareTo(event1[1]);
        int c2 = event2[1].compareTo(event1[0]);
        boolean ans=(c1 <= 0) && (c2 >= 0);
        return ans;
    }
}