class MyCalendar {
    ArrayList<int[]> arr;
    public MyCalendar() {
        arr = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for(int []i:arr){
            if(startTime<i[1] && endTime>i[0]) return false;
        }
        arr.add(new int[] {startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */