package Heroes;

import java.util.Scanner;
public class ExemplosEd_02 {
	public static void main(String[]args) {
		Scanner shallow = new Scanner(System.in);
		
		double J;
		
		J = shallow.nextDouble();
		
		if (J <= 1.99 && J >= 5.99) {
			System.out.println("O n�mero esta entre 1.99 e 5.99");
		}else {
			System.out.println("O N�MERO N�O PARTICIPA DESTE CONJUNTO");
			shallow.close();
		}
		
	}

}
