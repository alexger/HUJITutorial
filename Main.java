public class Main {

    static private int factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else if (n > 0)
        {
            return n * factorial(n - 1);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
