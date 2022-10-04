import java.util.Scanner;

public class HW4_16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter month(0 < x < 13):");
        int mm = in.nextInt();
        System.out.println("Enter day(0 < x < 32):");
        int dd = in.nextInt();
        System.out.println("Enter year(1999 < x < 2101):");
        int yyyy = in.nextInt();
        if (mm > 0 && mm < 13 && dd > 0 && dd < 32 && yyyy > 1999 && yyyy < 2101 ){
            if (mm == 2 && yyyy % 4 == 0 && yyyy % 100 != 0 && yyyy % 400 == 0 && dd >29 ) {
                System.out.println("привіт You enter incorrect value. run one more time with correct value");
            }
            else if (mm == 2 && yyyy % 4 == 0 && yyyy % 100 != 0 && yyyy % 400 == 0 && dd <30) {
                System.out.println("лютий");
            }
            else if (mm == 2 && dd >28){
                System.out.println(" привіт You enter incorrect value. run one more time with correct value");
            }
            else if (mm == 2) {
                System.out.println("лютий");
            }
            else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && dd == 31){
                System.out.println("привіт You enter incorrect value. run one more time with correct value");
            }
            else if (mm == 4 || mm == 6 || mm == 9 || mm == 11){
                if (mm == 4){
                    System.out.println("квітень");
                }
                else if (mm == 6){
                    System.out.println("червень");
                }
                else if (mm == 9){
                    System.out.println("вересень");
                }
                else{
                    System.out.println("листопад");
                }
            }
        }
        else{
            System.out.println("Привіт 4You enter incorrect value. run one more time with correct value");
        }
    }
}