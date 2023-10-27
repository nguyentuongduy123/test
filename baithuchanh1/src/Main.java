/*
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number= (int) ((Math.random()*100)+1);
        Scanner sc= new Scanner(System.in);
        while (true)
        {
            System.out.println("nhập vào dự đoán của bạn ");
            int a= sc.nextInt();
            if(a<number)
            {
                System.out.println("dự đoán nhỏ hơn");
            } else if (a>number) {
                System.out.println("dự đoán lớn hơn");
            }
            else {
                System.out.println("dự đoán đúng");
                break;
            }
        }
        sc.close();
    }
}
*/
