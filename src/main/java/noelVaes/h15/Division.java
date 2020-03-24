package noelVaes.h15;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d", num, den, div);
//        } catch (NumberFormatException | ArithmeticException nfe) {
//            System.out.println("Invalid number");
//            System.out.println(nfe.getMessage());
//            nfe.printStackTrace();
        } finally {
            keyboard.close();
            System.out.println("The End");
        }

//        catch (RuntimeException e) {
//            System.out.println("Invalid input: " + e.getMessage());
//            e.printStackTrace();
//        } catch (NumberFormatException nfe) {
//            System.out.println("Invalid number");
//            System.out.println(nfe.getMessage());
//            nfe.printStackTrace();
//        } catch (ArithmeticException ae) {
//            System.out.println("Division by 0");
//            System.out.println(ae.getMessage());
//            ae.printStackTrace();
//        }

    }
}
