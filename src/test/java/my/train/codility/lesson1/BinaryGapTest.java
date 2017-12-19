package my.train.codility.lesson1;

import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

@Slf4j
public class BinaryGapTest {

    private int input;
    private int maxGap;
    private static BinaryGapSolver solver;

    @BeforeClass
    public static void setUp() throws Exception {
        solver = new BinaryGapSolver();
    }

    @Test
    public void solve_negative_input() throws Exception {
        input = -1;
        maxGap = solver.solve(input);
        assertEquals(0, maxGap);
    }

    @Test
    public void solve_zero_input() throws Exception {
        input = 0;
        maxGap = solver.solve(input);
        assertEquals(0, maxGap);
    }

    @Test
    public void solve_int_max_value() throws Exception {
        input = Integer.MAX_VALUE;
        maxGap = solver.solve(input);
        assertEquals(0, maxGap);
    }

    @Test
    public void solve_prev_max_int() throws Exception {
        input = Integer.MAX_VALUE - 1;
        maxGap = solver.solve(input);
        assertEquals(0, maxGap);
    }

    @Test
    public void solve_int_overflow() throws Exception {
        input = Integer.MAX_VALUE + 1;
        maxGap = solver.solve(input);
        assertEquals(0, maxGap);
    }

    @Test
    public void solve_gap_9() throws Exception {
        input = 9;
        maxGap = solver.solve(input);
        assertEquals(2, maxGap);
    }

    @Test
    public void solve_gap_42() throws Exception {
        input = 42;
        maxGap = solver.solve(input);
        assertEquals(1, maxGap);
    }

    @Test
    public void solve_gap_1041() throws Exception {
        input = 1041;
        maxGap = solver.solve(input);
        assertEquals(5, maxGap);
    }

}