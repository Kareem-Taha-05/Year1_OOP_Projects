import java.util.Scanner;
public class Team2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        while(true) {
            System.out.print("Enter the index: ");
            x = input.nextInt();
            if (x <= 0) {
                System.out.println("Invalid index");
            }
            else
                break;
        }
        System.out.print("The series is: ");
        for(int i = 0 ; i < x ; i++){
            System.out.print(fibseries(i) + " ");

        }
        input.close();
    }
    public static long fibseries(int n){
        if(n < 2){
            return n;
        }
        else
            return fibseries(n-1) + fibseries(n-2);
    }
}