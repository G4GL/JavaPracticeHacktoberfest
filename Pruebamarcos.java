import java.util.Scanner;

public class Prueba1 {

	final static int TIPO_DE_IVA = 21;
	final static double PI = 3.14159265d;

	public static void main(String[] args) {

		byte a;

		short b, c = 3;

		int d = -30;
		int e = 0xC125;

		long f = 434123;
		long g = 5L; /* la L en este caso indica Long */

		char car1 = 'c';
		char car2 = 99; /* car1 y car2 son lo mismo porque el 99 en decimal es la ‘c’ */

		float pi = 3.1416f;
		// float pi=3.1416F; /* la F en este caso indica Float*/
		float medio = 1 / 2F; /* 0.5 */

		double millon = 1e6; /* 1x106 */
		double mitad = 1 / 2d; /* 0.5 la D en este caso indica Double */
		
		
		double longitud;
		double radio;
		double area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("INTRODUZCA RADIO: ");
		
		radio=sc.nextDouble();
		longitud=2*PI*radio;
		area=PI*radio*radio;
		
		

	//	System.out.print(car2);
	//	System.out.print(medio);
	//	System.out.print(millon);
		
		System.out.println("la longitud es: "+longitud);
		System.out.println("El area es: "+area);
		
	}
}
