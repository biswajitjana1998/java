public class primid {
    public static void main(int n) {
        for (int i = 0; i <= n; i++) { // outer loop
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {// inner loop
            System.out.print("* ");

        }
        System.out.println();
    }

    }

    public static void main(String args[]){
        int n=6;
        primid(n);
    }
