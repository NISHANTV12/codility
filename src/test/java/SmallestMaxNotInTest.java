import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestMaxNotInTest {

    @Test
    public void solution() {
        SmallestMaxNotIn sol = new SmallestMaxNotIn();

        int[] a1 = new int[]{1, 3, 6, 4, 1, 2};
        Assert.assertEquals(sol.solution(a1), 5);

        int[] a2 = new int[]{1, 200, 300};
        Assert.assertEquals(sol.solution(a2), 299);

        int[] a3 = new int[]{-1, -3};
        Assert.assertEquals(sol.solution(a3), 1);
    }

}