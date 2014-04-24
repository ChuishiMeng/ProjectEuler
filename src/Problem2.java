
public class Problem2 {
	public static void main(String args[]){
		int sum = 0;
		int fibonacci = 1;
		int tmp1 = 1;
		int tmp0 = 0;
		while(fibonacci<4_000_000){
			if(fibonacci%2==0){
				sum += fibonacci;
			}
			tmp0 = tmp1;
			tmp1 = fibonacci;
			fibonacci = tmp0 + tmp1;
		}
		System.out.println(sum);
	}
}

/* possible improvements:

do not have to do the modular, coz` every 3 Fib number is the even one.

*/