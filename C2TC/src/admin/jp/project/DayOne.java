package admin.jp.project;
public class DayOne {
	    public static void main(String[] args) {
	       
	        int a = 10;
	        int b = 5;
	        boolean flag1 = true;
	        boolean flag2 = false;

	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));  
	        System.out.println("a - b = " + (a - b));  
	        System.out.println("a * b = " + (a * b)); 
	        System.out.println("a / b = " + (a / b));  
	        System.out.println("a % b = " + (a % b));  
	        System.out.println();

	       
	        System.out.println("Logical Operators:");
	        System.out.println("flag1 && flag2 = " + (flag1 && flag2)); 
	        System.out.println("flag1 || flag2 = " + (flag1 || flag2)); 
	        
	        System.out.println();

	     

	        System.out.println("Increment/Decrement Operators:");
	        System.out.println("a++ = " + (a++)); 
	        System.out.println("++b = " + (++b)); 
	        System.out.println("a-- = " + (a--)); 
	        System.out.println("--b = " + (--b)); 
	        System.out.println();

	       
	        System.out.println("Relational Operators:");
	        System.out.println("a == b = " + (a == b));  
	        System.out.println("a != b = " + (a != b));
	        System.out.println("a > b = " + (a > b));    
	        System.out.println("a < b = " + (a < b));   
	        System.out.println("a >= b = " + (a >= b));  
	        System.out.println("a <= b = " + (a <= b));  
	        System.out.println();

	     
	        System.out.println("Assignment Operators:");
	        int c = 10;
	        System.out.println("c = " + c);
	        c += 5;  // c = c + 5
	        System.out.println("c += 5 -> " + c);
	        c -= 3;  // c = c - 3
	        System.out.println("c -= 3 -> " + c);
	        c *= 2;  // c = c * 2
	        System.out.println("c *= 2 -> " + c);
	        c /= 4;  // c = c / 4
	        System.out.println("c /= 4 -> " + c);
	        c %= 2;  // c = c % 2
	        System.out.println("c %= 2 -> " + c);
	    }
}
