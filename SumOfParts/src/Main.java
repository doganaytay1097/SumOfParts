import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 different numbers, one basic number and two divisors:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int x = scanner.nextInt();
        scanner.nextLine();
        int y = scanner.nextInt();


        Solution solution = new Solution();

        System.out.println(solution.solution(number,x,y));

    }
}
class Solution{
    public int solution(int number,int x, int y){
        int a = 0;
        number = number-1;
        for (;number>0;number--){

            if (number%x == 0 || number%y == 0){
                a = a+number;
            }else continue;
        }
        return a ;
    }
}