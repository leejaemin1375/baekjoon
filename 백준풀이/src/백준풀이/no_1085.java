package 백준풀이;
import java.util.Scanner;

public class no_1085 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		
		//min함수는 입력받은 두개의 인자 중 작은 값을 리턴한다.
		int x_min = Math.min(x, w-x); // x축의 최솟값
		int y_min = Math.min(y, h-y); // y축의 최솟값
		
		System.out.println(Math.min(x_min, y_min));
		
	}

}
