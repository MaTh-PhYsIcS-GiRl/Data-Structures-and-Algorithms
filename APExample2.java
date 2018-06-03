public class APExample2 {
	int[] arr = new int[]{2,3,4,6,10,12,16,8};

	public int mystery(int low, int high, int num) {
		int mid = (low + high)/2;
		if (low > high)
			return low;
		else if (arr[mid] < num)
			return mystery(mid+1, high, num);
		else if (arr[mid] > num)
			return mystery(low, mid-1, num);
		else //arr[mid] == num
			return mid;
	}
	
	public static void main(String[] args)
	{
		APExample2 one = new APExample2();
		System.out.println(one.mystery(0, 8, 4));
	}
	
}
