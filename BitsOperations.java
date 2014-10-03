 public class BitsOperations{
	public static void main(String args[]){
		int input = Integer.parseInt(args[0]);
		int bitmask;
		System.out.println("The original value, "+ input+", in binary is: ");
		if (input < 0){
			int input2 = Math.abs(input);
			bitmask = Integer.parseInt(Integer.toBinaryString((input2 -1)^ 1023));
			int negbitmask = (~bitmask);
		}
		else {
			bitmask = Integer.parseInt(Integer.toBinaryString(input));
		}
		

		System.out.println(bitmask);
		System.out.println("After right shift 3 bits: ");
		System.out.println(Integer.toBinaryString(rightShifts(input, 3)));
		System.out.println("After left shift 3 bits: ");
		System.out.println(Integer.toBinaryString(leftShifts(input, 3)));
		System.out.println("After negative all bits: ");
		System.out.println(Integer.toBinaryString(~input));
		negateAllBits(input);
 	}
	
	public static int rightShifts(int in, int n){
		int orig = in;
		int rightShiftAmount = n;
		int shifted = orig >>> rightShiftAmount;
		return shifted;
	}

	public static int leftShifts(int in, int n){
		int orig = in;
		int leftShiftAmount = n;
		int shifted = orig << leftShiftAmount;
		return shifted;
	}
	
	public static int negateAllBits(int in){
		int orig = in;
		int negate = ~orig;
		return negate;
	}	
}