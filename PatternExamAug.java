public class PatternExamAug{
	public static void main(String[]args){
		int n=0;
		for(int i=1;i<=5;i++){ // i =2 n =11 i =3 == 12 
			for(int j=1;j<=5;j++){
				if(i%2==1){
					System.out.printf(++n+" ");// 5  // 13
				}
				else{
					System.out.printf(--n+" "); // 10 9 8 7 6 
				}
			}
			if(i %2 ==0){
				n += 4;
			}else{
				n+= 6;
			}
			System.out.println();
		}
	}
}