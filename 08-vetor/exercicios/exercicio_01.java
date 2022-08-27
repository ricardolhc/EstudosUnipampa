public class Main
{
	public static void main(String[] args) {
		
		int [] n = new int [5];
		int impar = 1;
		
		for(int i = 0; i < n.length; i++) {
		    n[i] = impar;
		    impar += 2;
		}
		
		for(int i = 0; i < 5; i++) {
		    System.out.print(n[i] + " ");
		}
		
	}
}