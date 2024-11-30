class Value {
	int a,b;
	void setValue(int x,int y){
		a=x;
		b=y;
	}
}
class Add extends Value{
	int getResult(){
		return a+b;
	}
}
class Mul extends Value{
	int getResult(){
		return a*b;
	}
}
class Calculator{
	void performOperation(Add ad){
		int result=ad.getResult();
		System.out.printf("Addition is %d\n",result);
	}
	void performOperation(Mul m){
		int result=m.getResult();
		System.out.printf("Multipliction is %d\n",result);
	}
}
public class TightCouplingEx{
	public static void main(String[]args){
		Calculator c=new Calculator();
		Add a1=new Add();
		a1.setValue(10,20);
		c.performOperation(a1);
		
		Mul m=new Mul();
		m.setValue(5,4);
		c.performOperation(m);
	}
}