import java.util.Scanner;
public class HalfPyramidStar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Half pyramid size: ");
        int n=sc.nextInt();
        for(int line= 1;line<=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
