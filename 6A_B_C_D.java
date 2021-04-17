import java.util.*;
     public class Demo {

    	 public static void main(String[] args) {
    		//6A	
    			int a = 0;
    			int b = 1;
    			System.out.print(a + " " + b);
    			for (int i=0; i<8; i++) {
    				int c = a+b;
    				System.out.print(" " + c );
    				a = b;
    				b = c;
    			}
    			
    		//6B
    			int d = 0,e = 1, f = 1;
    			while (e < 100) {
    				
    				if (f % 2 == 1) {
    					System.out.print(" " + f);
    				}
    				d = e;
    				e = f;
    				f = d+e;
    			}
    			
    		//6C
    			int g = 0,h = 1,i = 1;
    			while (i<1000) {
    				
    				if (h > 100 && i%2==0) {
    					
    					System.out.print(" " + i);
    				}
    				g = h;
    				h = i;
    				i = g + h;
    			}
    			
    		//6D
    			int j = 0;
    			int k = 1;
    			int l = 1;
    			int sum = 0;
    			while (l < 100) {
    				System.out.print(" " + l);
    				sum = sum + l;
    				j = k;
    				k = l;
    				l = j+k;
    			}
    			System.out.println("\nThe sum is: " + sum);

    		}

    		}

    	}