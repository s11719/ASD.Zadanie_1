import java.util.Random;


public class Main {

	public static void main(String[] args) {

		int[] tablica1 = new int[10];
		int[] tablica2 = new int[10];
		
		Random generator = new Random();
		
		for (int i = 0; i < 10; i++)
		{			
			int l = generator.nextInt(100);
			tablica1[i] = l;
			System.out.println("komorka " + i + " to " + tablica1[i]);
		}
		
		//for (int element : tablica1)
		//	System.out.println(element);
		
		for (int i = 1; i < 10; i++)
		{
			if (tablica1[i - 1] < tablica1[i])
			{
				System.out.println("i to " + i);
				tablica2[i] = tablica1[i - 1];
				System.out.println(tablica2[i]);
			}			
			
		}
	

	}
	
}