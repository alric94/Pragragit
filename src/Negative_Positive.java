import java.util.Scanner;
public class Negative_Positive {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("print x");
        int x = sc.nextInt();
        System.out.println("print y");
        int y = sc.nextInt();

        if (x==y){
            System.out.println("same shizz");
        }
        else if (x>y){
            System.out.println("x is king");
        }
        else {
            System.out.println("y is bling");
        }
    }



}
