
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static int firstDigit(int num){
        if(num<0){
            num = num * -1;
        }
        while(num>=10){
            num = num / 10;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number.");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int dig = firstDigit(num);
        System.out.println(dig);
    }
}
