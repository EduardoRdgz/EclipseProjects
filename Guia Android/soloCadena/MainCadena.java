
public class MainCadena {
   static String a = "a";
   static String b = "b";
   static int c = 0;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mio();
		Ian();
		
	}
		
	public static void mio () {
		 
			do {
		for(int x = 0; x < 4; x++) {
			System.out.print(a + "\t" + b + "\t");
		}
		System.out.println();
		
		for(int x = 0; x < 4; x++) {
			System.out.print(b + "\t" + a + "\t");
		}
		System.out.println();
		c++;
		
	}while(c < 4);
}
	
	
	//for anadidos
	public static void Ian() {
		for(int x = 0; x < 8; x++) {
			if(x < 8 && x > 0) {
					System.out.println();	
				}
			for(int y = 0; y < 8; y++) {
				if(y%2 == 0) {
					if(x%2 == 0) {
						System.out.print(b +"\t");
					}else {
						System.out.print(a + "\t");
					}
				}
				if(y%2 != 0)
					if(x%2 == 0){
						System.out.print(a + "\t");
					}else {
						System.out.print(b + "\t");
					}
			}
		
		}
	}
	
		
}
