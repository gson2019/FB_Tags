import java.util.Arrays;

public class Leet153 {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length==0) return 0;
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int rooms = 0, prevEnd = 0;
        for(int i = 0; i < intervals.length; i++){
            if(starts[i] < ends[prevEnd]){
                rooms++;
            }else{
                prevEnd++;
            }
        }
        return rooms;
    }
}
