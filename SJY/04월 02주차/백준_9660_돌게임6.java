import java.util.*;
import java.io.*;

public class 백준_9660_돌게임6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		if(N % 7 == 0 || N % 7 == 2) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}
	}

}
