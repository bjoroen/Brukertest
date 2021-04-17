
//Given a non-empty array of integers, return the result of multiplying the values together in order.
// Example:
//[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24



public class Oppgave1 {
    public static int grow(int[] x){
        int results = 1;
        for (int a: x){
            results *= a;
        }

        return results;
    }
}
