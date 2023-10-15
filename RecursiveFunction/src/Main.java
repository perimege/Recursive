import java.security.InvalidParameterException;

public class Main {

    public static void main(String[] args) {
        int[] result = findExponent(2, 6);
        System.out.println("Exponent result: " + result[0]);
        System.out.println("Iteration count is: " + result[1]);
    }
    public static int[] findExponent(int base, int exponent) {
        int[] result = new int[2]; // result[0] is exponent result and result[1] is iteration count

        if (exponent < 0) {
            throw new InvalidParameterException("Exponent must be positive!");
        }

        if (exponent == 0) {
            result[0] = 1;
            return result;
        }

        int[] recResult = findExponent(base, exponent - 1);
        result[1] = recResult[1] + 1; // Increment iteration count

        result[0] = recResult[0];

        for (int i = 0; i < base-1; i++) {
            result[0] += recResult[0];
        }

        return result;
    }
}



//        f(3,4)=f(3,3)+f(3,3)+f(3,3)
//        f(3,3)=f(3,2)+f(3,2)+f(3,2)
//        f(3,2)=f(3,1)+f(3,1)+f(3,1)
//        f(3,1)=f(3,0)+f(3,0)+f(3,0)
//
//        f(2,3)=f(2,2)+f(2,2)
//        f(2,2)=f(2,1)+f(2,1)
//        f(2,1)=f(2,0)+f(2,0)