/* 1
  212
 32123
4321234
*/

class ExamPattern{
	public static void main(String[]args){
		for(int i=1;i<=4;i++){
			int k = i;
			int l = 0;
			for(int j=1;j<=7;j++){
				if(j>=5-i && j<=3+i){
					if(j<=7/2+1){
						l = k;
						System.out.print(k--);
					}else{
						System.out.print(++l);
					}
				}
				else{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}