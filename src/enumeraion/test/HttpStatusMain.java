package enumeraion.test;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code: ");
        int codeInput = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(codeInput);
        System.out.println("status" + status);
        if (status == null) {
            System.out.println("오류");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess: " + status.isSuccess());
        }
    }
}
