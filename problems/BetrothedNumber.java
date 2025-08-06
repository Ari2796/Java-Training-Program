package LogicalProblems;

public class BetrothedNumber {

	public static void main(String[] args) {

        int m = 48, n = 75;
        if (sumOfDivisors(m) == n + 1 && sumOfDivisors(n) == m + 1) {
            System.out.println(m + " and " + n + " are Betrothed Numbers");
        } else {
            System.out.println(m + " and " + n + " are NOT Betrothed Numbers");
        }
    }
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

}
