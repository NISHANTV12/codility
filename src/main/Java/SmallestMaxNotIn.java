import java.util.Arrays;
import java.util.OptionalInt;

class SmallestMaxNotIn {
    public int solution(int[] A) {
        // write your code in Java SE 8
        OptionalInt max = Arrays.stream(A).max();
        if(max.isPresent()) {
            int maxVal = findSmallestMaxNotIn(A, max.getAsInt());
            return maxVal > 0 ? maxVal : 1;
        }
        else
            return Integer.MIN_VALUE;
    }

    private int findSmallestMaxNotIn(int[] arr, int maxVal) {
        if(Arrays.stream(arr).anyMatch(x -> x == maxVal - 1))
            return maxVal + 1;
        else
            return maxVal - 1;
    }

    public static void main(String[] args) {
        SmallestMaxNotIn sol = new SmallestMaxNotIn();
        int[] a1 = new int[]{1, 3, 6, 4, 1, 2};
        int[] a2 = new int[]{1, 200, 300};
        int[] a3 = new int[]{-1, -3};
        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));
        System.out.println(sol.solution(a3));
    }
}