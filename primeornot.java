
import java.util.*;

public class primeornot {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("prime");
        } else {
            System.out.println("Not prime");
        }
    }

}
