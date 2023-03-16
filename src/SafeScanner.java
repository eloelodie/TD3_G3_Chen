import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.InputStream;

public class SafeScanner {


//-----------------------------------------7-----------------------------------------------
//        private Scanner sc;
//
//        public SafeScanner() {
//             sc = new Scanner(System.in);
//    }
//
//        public int getInt() {
//        boolean inputValid = false;
//        int answer = 0;
//        while (!inputValid) {
//            try {
//                System.out.println("What is your age?");
//                answer = sc.nextInt();
//                inputValid = true;
//            } catch (InputMismatchException e) {
//
//                sc.next();
//            }
//        }
//        return answer;
//    }
//
//        public void closeScanner() {
//        sc.close();
//    }
//
//         public static void main(String[] args) {
//            SafeScanner scanner = new SafeScanner();
//            int answer = scanner.getInt();
//            System.out.printf("Your age is %d%n", answer);
//            scanner.closeScanner();
//    }
// }
//-----------------------------------------9-----------------------------------------------

    private Scanner sc;

    public SafeScanner(InputStream is) {
        sc = new Scanner(is);
    }

    public int getInt() {
        boolean inputValid = false;
        int answer = 0;
        while (!inputValid) {
            try {
                System.out.println("What is your age?");
                answer = sc.nextInt();
                inputValid = true;
            } catch (InputMismatchException e) {

                sc.next();
            }
        }
        return answer;
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        SafeScanner scanner = new SafeScanner(System.in);
        int answer = scanner.getInt();
        System.out.printf("Your age is %d%n", answer);
        scanner.closeScanner();
    }
}