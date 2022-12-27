public class Main {
    public static void main(String[] args) {
        int[]digits = {9,9,9,9};
        int[] digitsPlus1 = plusOne(digits);
        for(int i=0; i<digitsPlus1.length; i++){
            System.out.print(digitsPlus1[i]+", ");
        }


    }
    public static int[] plusOne(int[] digits) {
//        int i = digits.length - 1;
//        while(i >= 0){
//            if(digits[i] == 9)
//                digits[i--] = 0;
//            else{
//                digits[i]++;
//                return digits;
//            }
//        }
//        int[] array = new int[digits.length+1];
//        array[0] = 1;
//        return array;


        int last = digits.length-1;
        digits[last] = digits[last]+1;
        int i = last;
        int[] digitsPlus = new int[digits.length+1];
        while(digits[i]==10){
            i=i-1;
            if(i<0){
                digitsPlus[0]=1;
//                for(int k=1; k<digitsPlus.length; k++)
//                    digitsPlus[k]=0;
                return digitsPlus;
            }
            else{
                digits[i] = digits[i]+1;
            }
        }
        while(i<last){
            i=i+1;
            digits[i]=0;
        }
        return digits;

    }
}