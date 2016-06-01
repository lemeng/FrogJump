
public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 10;
		int Y = 85;
		int D = 30;
		
		int result = 0;
		result = solution(X,Y,D);
		System.out.println(result);
	}
	
	public static int solution(int X, int Y, int D) {
		int jumps = 0;
		if ((Y - X) % D != 0) {
			jumps = (Y-X)/D + 1;
		} else {
			jumps = (Y-X)/D;
		}
		return jumps;
	}

}
