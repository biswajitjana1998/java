public class NestedLoop2 {
    public static void main(String[] args) {
        int b = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(b + " ");
                b++;

            }
            System.out.println("");

        }
    }

}
