package deep_return;

public class array_with_var_args {
	static int sum(int ...arr) {
		int sam = 0;
		for(int a:arr) {
			sam = a +sam;
		}
		return sam;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to var args method");
		System.out.println("The sum of 15,36,12,34,9,4,49 and 2 is :"+sum(15,36,12,34,9,4,49,2));

	}

}
