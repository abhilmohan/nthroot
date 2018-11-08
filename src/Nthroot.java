import java.util.Scanner;

public class Nthroot {

    public static void main(String args[]){
        Double a, b ,result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base");
        a = scanner.nextDouble();
        System.out.print("Enter the value");
        b = scanner.nextDouble();
        NthrootCalculator nthrootCalculator = new NthrootCalculator();
       result = nthrootCalculator.nroot(a,b);
       System.out.println(result);
    }
}
