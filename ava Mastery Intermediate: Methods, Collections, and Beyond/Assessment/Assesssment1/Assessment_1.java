import java.util.Random;
public class Assessment_1 {
    public static void main(String[] args){
        long random10DigitNumber=genertaeTenDigiNumber();
        System.out.println("10 digit random number is  "+ random10DigitNumber);
    }
    public static long genertaeTenDigiNumber(){
        Random random=new Random();
        long min=1000000000L;
        long max=9999999999L;
        long random10DigitNumber=min+((long)(random.nextDouble()*(max-min+1)));
        return random10DigitNumber;
    }
}
