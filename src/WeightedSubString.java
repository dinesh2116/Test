import java.util.*;
public class WeightedSubString{
	static int values[]=new int[26];
	static void insertValues(){
		values[0]=1;
		int prev=1;
		for(int i=1;i<26;i++){
			values[i]=(i+1)*prev+prev;
			prev=values[i];
		}
}
static StringBuffer formedString(StringBuffer sb,int k){
	int low=0;
	int high=25;
	while(k!=0){
		int ind=findfloor(k,low,high);
		sb.insert(0,(char)(ind+'A'));
		k=k-values[ind];
	}
	return sb;
}
static int findfloor(int k,int low,int high){
	int ans=-1;
	while(low<=high){
		int mid=(low+high)/2;
		if(values[mid]<=k){
			ans=mid;
			low=mid+1;
		}
		else
			high=mid-1;
	}
	return ans;
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	insertValues();
	int k=sc.nextInt();
	StringBuffer sb=new StringBuffer();
	StringBuffer res=formedString(sb,k);
	System.out.println(res);
	}
}