import java.util.Scanner;
class Interst{
	int principal,rate,duration;
	
	void setPRD(int pmat,int irate,int dur){
		this.principal=pmat;
		this.rate=irate;
		this.duration=dur;
	}
}
class CalculateInterst extends Interst{
	void callnterest(){
		int simpleInterst=(principal*rate*duration)/100;
		System.out.println("Calcualte the Simple interst is:"+simpleInterst);
	}
}
public class Q3InterstApp{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Prinacipal Amount:");
		int principal=scn.nextInt();
		
		System.out.println("enter the rate of Interst:");
		int rate=scn.nextInt();
		
		System.out.println("Enter the Duration of (in year):");
		int duration=scn.nextInt();
		
		CalculateInterst ci=new CalculateInterst();
		ci.setPRD(principal,rate,duration);
		ci.callnterest();
	}
}