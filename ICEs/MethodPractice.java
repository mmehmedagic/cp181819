public class Main {
 	public static void main(String[] args) {
    	// Tests
    	System.out.println(in1To10(5, false)); // true
    	System.out.println(in1To10(11, false)); // false
    	System.out.println(in1To10(11, true)); // true
    	System.out.println(specialEleven(22)); // true
    	System.out.println(specialEleven(23)); // true
    	System.out.println(specialEleven(24)); // false
  	}

  	public static boolean in1To10(int n, boolean outsideMode) {
    	// Inside mode enabled: [1, 10]
    	if (outsideMode == false && (n >= 1 && n <= 10)) { 
      		return true;
    	} 
    	// Outside mode enabled: everything but (1, 10)
    	else if (outsideMode == true && (n <= 1 || n >= 10)) {
      		return true;
    	} else {
      		return false;
    	}
  	} 
  
  	public static boolean specialEleven(int n) {
    	// Checks if remainder (or mod) when dividing by 11 is 0 or 1
    	if (n % 11 == 0 || n % 11 == 1) { 
      		return true;
    	} else {
     		return false;
    	}
  	}
}