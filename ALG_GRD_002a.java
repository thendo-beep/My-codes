
import java.util.*;

public class ALG_GRD_002a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int a= in.nextInt();
		int b= in.nextInt();
		int q= in.nextInt();
		
		
		if(a>=1 && a<b && (b-a+1)%q==0) {
			
			int Q= a;
			int A=Q;
			
			while(Q<b) {
				
				Q+=q;
				//System.out.println(secLine(A, Q, q)-Q);
				
				System.out.println( "Sum from " + Integer.toString( A) +" to " +Integer.toString( Q-1)  +": "+Integer.toString( secLine(A, Q, q)-Q));
				A+=q;
				System.out.println( "Sum from " + Integer.toString( a) +" to " +Integer.toString( Q-1)  +": "+Integer.toString( secLine(a, Q, q)-Q));
			System.out.println();
			}
			
		}
		in.close();
				

	}
	
	public static int secLine( int a, int b, int q ) {
		
		int sum=a;
		int i=0;
		while(a<b) {
			sum+=a;
			a++;
			i++;
		}
	   return sum +i ;
		
	}

}
