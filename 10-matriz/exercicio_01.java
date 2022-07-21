public class Main
{
	public static void main(String[] args) {
		
		int n[][] = new int[5][5];
		             
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n[0].length; j++) {
		        if(i == j) {
		            n[i][j] = 1;
		        } else {
		            n[i][j] = 0;
		        }
		    }
		}    
		
		for(int i = 0; i < n.length; i++) {
		    for(int j = 0; j < n.length; j++) {
		        System.out.print(n[i][j] + " ");
		    }
		    System.out.println();
		}
		 
		
	}
}