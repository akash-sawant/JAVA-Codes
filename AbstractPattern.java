abstract class Pattern {
    
    abstract void display();
}
class First extends Pattern {
    void display() {
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
				if(i%2==0){
					 System.out.print("* ");
				 }else{
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class Second extends Pattern {
    void display() {
        System.out.println("Pattern 2:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j <=5; j++) {
				if(true){
					 System.out.print("* ");
				 }else{
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class AbstractPattern {
    public static void main(String[] args) {
        Pattern firstPattern = new First();
        Pattern secondPattern = new Second();

        firstPattern.display();
        secondPattern.display();
    }
}



