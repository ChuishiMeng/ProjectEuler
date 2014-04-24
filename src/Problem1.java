
public class Problem1 {
	public static void main(String[] args) {
		int limitation = 999;
		int sum = 0;
		for(int i=1;i<=limitation;i++){
			if(i%3==0 || i%5==0){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}

/* possible improvements

solution = sum(all numbers below 1000 which can divide 3) + sum(all numbers below 1000 which can divide 5) - sum(all numbers below 1000 which can divide 15)

*/