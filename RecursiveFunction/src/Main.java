public class Main {
    static int iterationCount=0;
    public static void main(String[] args) {
        System.out.println(findExponent(3,10));
        System.out.println("Iteration count is:"+iterationCount);
    }

    public static int findExponent(int base,int exponent){
        iterationCount++;
        if(exponent==0){
            return 1;
        }
        return  base* findExponent(base,exponent-1);
    }
}