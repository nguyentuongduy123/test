
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        int n,x;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("nhap vào bậc: ");
            n=sc.nextInt();
            if(n<0)
            {
                System.out.println("bậc của đa thức phải lớn hơn 0");
            }
        }while (n<0);
        int a[]=new int[n+1];
        int ketqua=0;
        int level=n;
        for(int i=0;i<=n;i++)
        {
            System.out.println("nhap vao hệ số "+i+" ");
            a[i]= sc.nextInt();
        }
        System.out.println("nhap vao số giá trị x: ");
        x= sc.nextInt();
        for(int i=n; i>=0;i--)
        {
            ketqua+=a[i]*Math.pow(x*1.0,level--);

        }
        System.out.println("giá trị của đa thức là "+ketqua);
        sc.close();
    }
}
