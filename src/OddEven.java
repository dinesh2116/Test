import java.math.BigInteger;
import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
   /* Scanner s=new Scanner(System.in);
    BigInteger a=s.nextBigInteger();
   // BigInteger temp=a;
    //char[] digit = a.toString().toCharArray();
    String digit = a.toString();
    int[] c = new int[digit.length()];
    for(int j=0; j<digit.length(); j++) {
       c[j] = Integer.parseInt(String.valueOf(digit.charAt(j)));
    }

    int ch= digit.length();
    int odd=0,even=0;
    for(int i=0;i<ch;i++) {
    	//System.out.println(c[i]);
    	//System.out.println(odd);
    	odd=odd+c[i];
    	//System.out.println(odd);

    	i++;
    }
    for(int i=1;i<ch;i++) {
    //	System.out.println(digits[i]);
    	even+=c[i];
    	//System.out.println(even);

    	i++;
    }
    int ans=odd-even;
    System.out.println(ans);
}
}  */
	
	        Scanner s = new Scanner(System.in);
	        String str = s.nextLine();
	        char a[]=str.toCharArray();
	        int num[] = new int[a.length];
	        for(int i=0;i<a.length;i++)
	        {
	            num[i]=a[i]-'0';
	        }
	        int o_sum=0,e_sum=0;
	        for(int i=0;i<num.length;i++)
	        {
	            if(i%2==0)
	            {
	                o_sum+=num[i];
	            }
	            else
	            {
	                e_sum+=num[i];
	            }
	        }
	        if(o_sum>e_sum)
	            System.out.println(o_sum-e_sum);
	        else
	            System.out.println(e_sum-o_sum);
	    }
}