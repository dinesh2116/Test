
import java.io.*;
class Fibonacci extends Thread
{
     public void run()
     {
          try {
               int a=0, b=1, c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter the Limit for fabonacci: ");
               int n = Integer.parseInt(br.readLine());
               
               
                 if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        else{
               System.out.println("\n=================================");
           System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }}
          catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }
     }
}
class Reverse extends Thread
{
     public void run()
     {
          try
          {
               System.out.println("\n=================================");
               System.out.println("\nReverse is: ");
               System.out.println("=================================");
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
               }
               System.out.println("\n=================================\n\n");
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
class Main 
{
     public static void main(String[] args) 
     {
          try
          {
               Fibonacci fib = new Fibonacci();
               fib.start();
               fib.sleep(4000);
               Reverse rev = new Reverse();
               rev.start();
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
