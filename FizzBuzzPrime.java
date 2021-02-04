public class FizzBuzzPrime {
    public static void main(String[] args) {
        boolean isFizz, isBuzz, isPrime;
        int j;

        for (int i = 1; i <= 100; i++) {

            isFizz = isBuzz = false;
            isPrime = true;

            if (i % 3 == 0) {
                isFizz = true;
                System.out.print("Fizz");
            }

            if (i % 5 == 0) {
                isBuzz = true;
                System.out.print("Buzz");
            }

            if (i == 1) {
                isPrime = false;
            }

            j = 2;
            while (j < i && isPrime) {
                if (i % j == 0) {
                    isPrime = false;
                }
                j++;
            }

            if (isPrime) {
                System.out.print("Prime");
            }

            if (!isFizz && !isBuzz && !isPrime) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
