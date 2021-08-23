
public class New {
	 
		public static void main(String[] args)
		{
			int x=20,y=35;
			x= y++ + x++;
			y= ++y + ++x;
			System.out.println(x+" "+y);
		}
	}

