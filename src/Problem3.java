
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long inputNumber = 600851475143L;
		long output = 1;
		for(long i=600851475143L/2;i>0;i++){
			if(inputNumber%i == 0){
				output = i;
				break;
			}
		}
		System.out.println("result is: " + output);
	}

}
