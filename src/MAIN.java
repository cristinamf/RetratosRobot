import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int pelo;
		int ojos;
		int orenar;
		int boca;
		String barbilla="   \\______/";
		
		do {
			System.out.println("1. WWWWWWWWW");
			System.out.println("2. \\\\\\//////");
			System.out.println("3. |\"\"\"\"\"\"\"|");
			System.out.println("4. |||||||||");
			System.out.println("Elija pelo (numero entre 1 y 4):");
			pelo=sc.nextInt();
			if (pelo<1 || pelo>4) {
				System.out.println("El numero introducido no es valido");
			}
		}while(pelo<1 || pelo>4);
		
		do {
			System.out.println("1. |  O O  |");
			System.out.println("2. |-(· ·)-|");
			System.out.println("3. |-(o o)-|");
			System.out.println("4. |  \"/  |");
			System.out.println("Elija ojos (numero entre 1 y 4):");
			ojos=sc.nextInt();
			if (ojos<1 || ojos>4) {
				System.out.println("El numero introducido no es valido");
			}
		}while(ojos<1 || ojos>4);	
		
		do {
			System.out.println("1. @   J   @");						
			System.out.println("2. {  \"   }");
			System.out.println("3. [   j   ]");
			System.out.println("4. <   -   >)");
			System.out.println("Elija orejas y nariz (numero entre 1 y 4):");
			orenar=sc.nextInt();
			if (orenar<1 || orenar>4) {
				System.out.println("El numero introducido no es valido");
			}
		}while(orenar<1 || orenar>4);	
		
		do {
			System.out.println("1. |  ===  |");						
			System.out.println("2. |   -   |");
			System.out.println("3. |  ___  |");
			System.out.println("4. |  ---  |");
			System.out.println("Elija boca (numero entre 1 y 4):");
			boca=sc.nextInt();
			if (boca<1 || boca>4) {
				System.out.println("El numero introducido no es valido");
			}
		}while(boca<1 || boca>4);
		
		switch(pelo) {
			case 1:
				System.out.println("1. WWWWWWWWW");
				break;
			case 2:
				System.out.println("2. \\\\\\//////");
				break;
			case 3:
				System.out.println("3. |\"\"\"\"\"\"\"|");
				break;
			case 4:
				System.out.println("4. |||||||||");
				break;	
		}
		switch(ojos) {
			case 1:
				System.out.println("1. |  O O  |");
				break;
			case 2:
				System.out.println("2. |-(· ·)-|");
				break;
			case 3:
				System.out.println("3. |-(o o)-|");
				break;
			case 4:
				System.out.println("4. | \" /  |");
				break;
		}
		switch(orenar) {
			case 1:
				System.out.println("1. @   J   @");						
				break;
			case 2:
				System.out.println("2. {  \"   }");
				break;
			case 3:
				System.out.println("3. [   j   ]");
				break;
			case 4:
				System.out.println("4. <   -   >)");
				break;
		}
		switch(boca) {
			case 1:
				System.out.println("1. |  ===  |");								
				break;
			case 2:
				System.out.println("2. |   -   |");
				break;
			case 3:
				System.out.println("3. |  ___  |");
				break;
			case 4:
				System.out.println("4. |  ---  |");	
				break;
	}
		System.out.println(barbilla);
	}

}
