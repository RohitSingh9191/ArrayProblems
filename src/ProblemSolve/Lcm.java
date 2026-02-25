package ProblemSolve;

public class Lcm {

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int hcf(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Lcm.lcm(10, 5));
         System.out.println(Lcm.hcf(14, 7));
         System.out.println(Lcm.gcd(14, 7));
    }

}
