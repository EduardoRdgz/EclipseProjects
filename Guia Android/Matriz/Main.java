
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] tablero = new String [8][8];
		for(int x = 0; x < 8; x++) {
			for(int y = 0; y < 8; y++) {
			if(x == 0 || x == 2 || x == 4 || x == 6) {
				tablero [y][x] = "b";
			}else if (x == 1 || x == 3 || x == 5 || x == 7 ) {
				tablero [y][x] = "a";
			}
			
		}
		
	}
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++ ) {
				System.out.print(tablero [i][j] + "\t");
							
			}
			System.out.println();
		}
	}
	
}
