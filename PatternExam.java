class PatternExam{
		public static void main(String[]args){
			 int a=1;
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++){
					if(j==i){
						System.out.printf("1");
					}
					else{
						System.out.printf(" ");
					}
				}
				System.out.println();
			}
		}
	}