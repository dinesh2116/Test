import java.util.*;
public class Test<T> 
{
     private T t;
     public void insert(T t) 
     {
     this.t = t;
     System.out.println(t);
     }
     public T get() 
     {
     return t;
     }
     
     public static void main(String[] args) 
     {   
         Scanner sc = new Scanner(System.in);
         
         Test<Integer> in = new Test<Integer>();
         int num = sc.nextInt();
         in.insert(num);
    
         Test<String> str = new Test<String>();
         String str1 = sc.next();
         str.insert(str1);
         
         Test<Float>  fl = new Test<Float>();
         float f = sc.nextFloat();
         fl.insert(f);
         
         System.out.println("Integer Value: " + in.get());
         System.out.println("String Value: " + str.get());
         System.out.printf("\nFloat value: %f", fl.get());
    }
}
