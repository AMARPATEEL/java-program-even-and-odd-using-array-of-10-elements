import java.util.Scanner;
public class Array_1
{
    public static void main(String[] args) 
    {
        
        Scanner Scan = new Scanner(System.in);
        
        int a[] = new int[10];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) 
        {
            a[i] = Scan.nextInt();
        }
        System.out.print("Odd numbers:");
        for(int i = 0 ; i < 10 ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(" "+a[i]);
            }
        }
        System.out.println(" ");
        System.out.print("Even numbers:");
        for(int i = 0 ; i < 10 ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }

    }
}