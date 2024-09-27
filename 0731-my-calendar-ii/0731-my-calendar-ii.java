import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCalendarTwo {
    private List<Integer> singleBooked;
    private List<Integer> doubleBooked;

    public MyCalendarTwo() {
        singleBooked = new ArrayList<>();
        doubleBooked = new ArrayList<>();
    }

    private List<Integer> intersection(List<Integer> intervals, int s, int e) {
        int l = Collections.binarySearch(intervals, s);
        if (l < 0) l = ~l;
        int r = Collections.binarySearch(intervals, e);
        if (r < 0) r = ~r;

        List<Integer> intersection = new ArrayList<>();
        if (l % 2 != 0) {
            if (!intervals.get(l).equals(s)) {
                intersection.add(s);
            } else {
                l++;
            }
        }

        intersection.addAll(intervals.subList(l, r));

        if (r % 2 != 0) {
            if (!intervals.get(r - 1).equals(e)) {
                intersection.add(e);
            } else {
                intersection.remove(intersection.size() - 1);
            }
        }

        return intersection;
    }

    private void add(List<Integer> intervals, int s, int e) {
        int l = Collections.binarySearch(intervals, s);
        if (l < 0) l = ~l;
        int r = Collections.binarySearch(intervals, e);
        if (r < 0) r = ~r;

        List<Integer> newIntervals = new ArrayList<>();
        if (l % 2 == 0) {
            newIntervals.add(s);
        }

        if (r % 2 == 0) {
            newIntervals.add(e);
        }

        intervals.subList(l, r).clear();
        intervals.addAll(l, newIntervals);
    }

    public boolean book(int start, int end) {
        if (!intersection(doubleBooked, start, end).isEmpty()) {
            return false;
        }

        List<Integer> inter = intersection(singleBooked, start, end);
        if (!inter.isEmpty()) {
            for (int i = 0; i < inter.size(); i += 2) {
                add(doubleBooked, inter.get(i), inter.get(i + 1));
            }
        }

        add(singleBooked, start, end);
        return true;
    }

    public static void main(String[] args) {
        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        System.out.println(myCalendarTwo.book(10, 20)); // returns true
        System.out.println(myCalendarTwo.book(50, 60)); // returns true
        System.out.println(myCalendarTwo.book(10, 40)); // returns true
        System.out.println(myCalendarTwo.book(5, 15));  // returns false
        System.out.println(myCalendarTwo.book(5, 10));  // returns true
        System.out.println(myCalendarTwo.book(25, 55)); // returns true
    }
}