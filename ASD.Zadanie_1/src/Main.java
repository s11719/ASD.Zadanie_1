import java.util.Random;


public class Main {

	public static void main(String[] args) {

		int[] tablica1 = new int[10];
		int[] tablica2 = new int[10];
		
		Random generator = new Random();
		
		for (int i = 5; i < 10; i++){
			
			int l = generator.nextInt(100);
			tablica1[i] = l;
		
		}
		
		System.out.println(tablica1[6]);
		
		for (int i = 1; i < 10; i++){
			
			
			
		}
	

	}
	
}
