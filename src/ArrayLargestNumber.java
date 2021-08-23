import java.util.*;
class ArrayLargestNumber {
static void printLargest(Vector<String> arr){
		Collections.sort(arr, new Comparator<String>(){
    @Override
public int compare(String X, String Y)
{
 Iterator it = arr.iterator();
 while(it.hasNext())
 {
   System.out.println(it.next()+" ");
 }
System.out.println();
System.out.println("Value of X "+X);
System.out.println("Value of Y "+Y);
		
String XY=X + Y;
String YX=Y + X;
System.out.println(XY);
System.out.println(YX);
return XY.compareTo(YX) > 0 ? -1:1;
	}
	});
Iterator it = arr.iterator();
while(it.hasNext())
		System.out.print(it.next());
	}
	
public static void main (String[] args) {
	Vector<String> arr;
	arr = new Vector<>();

		arr.add("9");
		arr.add("83");
		arr.add("93");
        arr.add("65");

		printLargest(arr);
	}
}

