package lesson3;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int jumps = 0;
        if (X != Y) {
            int diff = Y - X;
            jumps = diff / D;
            if (diff % D != 0) {
                jumps++;
            }
        }
        return jumps;
    }

    public int solution_ceiling(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
