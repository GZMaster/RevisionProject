package ExamRevision;

//These are the imported classes
import java.util.*;
import java.lang.*;

public class PrimeNumClass {

    public static void main(String[] args){

        int number;

        Scanner userInput = new Scanner(System.in);
        number = userInput.nextInt();
        checkIfPrimeNum(number);

        for (int i = 0; i <= 100; i++){
            number = i;
            System.out.println("Is " + number + " a prime number?");
            checkIfPrimeNum(number);
        }

    }

    //This is the method for finding the prime numbers
    public static boolean primeNumbers(int num){

        //local variables
        int i, m = 0, flag = 0;

        m = num / 2;

        if (num == 0||num == 1){
            return false;
        } else {

            for (i = 2; i <= m; i++){
                if (num % i == 0){
                    flag = 1;

                    break;
                }
            }

            if (flag == 0){
                return true;
            }

        }

        return false;

    }

    //This is the method for checking primeNumbers
    static void checkIfPrimeNum(int num){

        if(primeNumbers(num)) {
            System.out.println("yes " + num + " is a Prime Number");
        } else  {
            System.out.println("No " + num + " is not a Prime Number");
        }

    }

}
