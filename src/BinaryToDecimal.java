
public class BinaryToDecimal {

	public static int findDecimal(long num){
		int ans = 0,count = 0;
		while(num!=0){
			ans += ((num%10)*Math.pow(2, count));
			num = num/10;
			count++;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(findDecimal(100001l));
	}
	
}
