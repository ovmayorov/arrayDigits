public class Main {
    public static void main(String[] args) {
        int[]digits = {9};
        System.out.println(digits);

    }
    public static int[] plusOne(int[] digits) {
        int last = digits.length-1;
        digits[last] = digits[last]+1;
        if (digits[last]==10){
            int[] digitsPlus = new int[digits.length+1];
            int i=0;
            while(digitsPlus.length - (digitsPlus.length - 2) ==0){
                digitsPlus[i]=digits[i];
            }
            digitsPlus[digitsPlus.length-1]=0;
            digitsPlus[digitsPlus.length-2]=1;
            return digitsPlus;
        }
        return digits;
    }
}