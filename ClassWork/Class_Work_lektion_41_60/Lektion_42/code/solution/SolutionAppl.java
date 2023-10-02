package Lektion_42.code.solution;

public class SolutionAppl {
    public static void main(String[] args) {
        // a * x = b, x = b / a; a,b - int

        int a = 12;
        int b = 36;

        try {
            int x = solution(a, b);
            System.out.println("X = " + x);
        } catch (NoSolutionException e) {
//            System.out.println(m.getMessage());
//            System.out.println("a can't be equal 0. ");
            System.out.println("No solution");
        } catch (AnyNumberSolution e) {
            System.out.println("Any number is solution");
        } finally {
            System.out.println("Bye, bye!");
        }
    }
    // =========Method==========
    public static int solution(int a, int b) throws NoSolutionException {

        int res;
        if (a == 0 && b != 0) {
            throw new NoSolutionException();
        }
        if (a == 0 && b == 0) {
            throw new AnyNumberSolution();
        }
        res = b / a;
        return res;
    }
    // =========================
}
