import java.util.Scanner;


public class conversaoSegParaDiaHrMinSeg {
	
	/**
	 * @param args
	 */
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scan = new Scanner(System.in);
		
		int dia = 0, hora = 0, min = 0, seg = 0, N;
		
		System.out.println("Insira os segundos:");
		
		N = scan.nextInt();
		
		while (N > 86400) {
			dia++;
			N = N - 86400;
			
		}
		
		while (N >= 3600) {
			N = N - 3600;
			hora++;
		}
		
		while (N >= 60) {
			N = N - 60;
			min++;
		}
		
		if (N > 0) {	// como os segundos são os últimos, não precisam de while, somente uma simples conferência
			seg = N;
		}
		
		System.out.println(dia + " dia(s) " + hora + " hora(s) " + min + " min(s) " + seg + " seg(s)");
	}
}
