public class Factorial {
    public static void main(String[] args) {
        int number = 3;
        int factorial = calculate_factorial(number);
        System.out.println("Factorial of " + number + " is equal to = "+ factorial);
    }

    public  static int  calculate_factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * calculate_factorial(num-1);
        }
    }
}
