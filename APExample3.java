
public class APExample3 {
	public static int mystery(int n) {
		if(n <= 1)
			return 0;
		else
			return 1 + mystery(n/2);
	}
	
	public static void main(String[] args) {
		APExample3 one = new APExample3();
		System.out.print(one.mystery(8));
	}
}
