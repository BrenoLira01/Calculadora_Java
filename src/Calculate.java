import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO CALCULATOR\n");
        System.out.println("Here are some simple calculations:");
        System.out.println("9 + 9 = " + (9 + 9));
        System.out.println("9 - 9 = " + (9 - 9));
        System.out.println("9 x 9 = " + (9 * 9));
        System.out.println("9 / 9 = " + (9 / 9) + "\n");

        boolean continued = true;

        while (continued){

            int x = Integer.parseInt(scanner.next());
            String operation = scanner.next();
            int y = Integer.parseInt(scanner.next());
            int result = 0;

            if(operation.equals("+")){
                result = x + y;
            } else if(operation.equals("+")){
                result = x + y;
            } else if (operation.equals("-")) {
                result = x - y;
            }else if (operation.equals("x")) {
                result = x * y;
            }else if (operation.equals("/")) {
                if (y != 0){
                    result = x / y;
                } else {
                    System.out.println("division with zero is not allowed");
                    return;
                }
            } else {
                System.out.println("error");
            }

            System.out.println("result: " + result + "\n");
        }
    }
}
