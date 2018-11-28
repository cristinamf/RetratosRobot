import java.util.Scanner;

public class MAIN2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int pelo;
		int ojos;
		int orenar;
		int boca;
		String barbilla="   \\_______/";
		
		System.out.println("Pelo:           1. WWWWWWWWW 2. \\\\\\////// 3. |\"\"\"\"\"\"\"| 4. |||||||||");
		System.out.println("Ojos:           1. |  O O  | 2. |-(· ·)-| 3. |-(o o)-| 4. |  \\\"/  |\"");
		System.out.println("Orejas y nariz: 1. @   J   @ 2. {  \\\"   } 3. [   j   ] 4. <   -   >");
		System.out.println("Boca:           1. |  ===  | 2. |   -   | 3. |  ___  | 4. |  ---  |");
		System.out.println();
		System.out.println("Elija pelo (numero entre 1 y 4):");
		pelo=sc.nextInt();
		System.out.println("Elija ojos (numero entre 1 y 4):");
		ojos=sc.nextInt();
		System.out.println("Elija orejas y nariz (numero entre 1 y 4):");
		orenar=sc.nextInt();
		System.out.println("Elija boca (numero entre 1 y 4):");
		boca=sc.nextInt();
		System.out.println();
		
		if (pelo<1 || pelo>4) {
			System.out.println("El numero introducido no es valido");
		}else {
			if (pelo==1)
				System.out.println("1. WWWWWWWWW");
			else if(pelo==2)
				System.out.println("2. \\\\\\//////");
			else if(pelo==3)
				System.out.println("3. |\"\"\"\"\"\"\"|");
			else if(pelo==4)
				System.out.println("4. |||||||||");
		}
		
		if (ojos<1 || ojos>4) {
			System.out.println("El numero introducido no es valido");
		}else {
			if(ojos==1)
				System.out.println("1. |  O O  |");
			else if(ojos==2)
			System.out.println("2. |-(· ·)-|");
			else if(ojos==3)
			System.out.println("3. |-(o o)-|");
			else if(ojos==4)
			System.out.println("4. |  \"/  |");
		}
		
		if (orenar<1 || orenar>4) {
			System.out.println("El numero introducido no es valido");
		}else {
			if(orenar==1)
				System.out.println("1. @   J   @");	
			else if(orenar==2)
				System.out.println("2. {   \"   }");
			else if(orenar==3)
				System.out.println("3. [   j   ]");
			else if(orenar==4)
				System.out.println("4. <   -   >)");
		}
		
		
		if (boca<1 || boca>4) {
			System.out.println("El numero introducido no es valido");
		}else {
			if (boca==1)
				System.out.println("1. |  ===  |");		
			else if(boca==2)
				System.out.println("2. |   -   |");
			else if(boca==3)
				System.out.println("3. |  ___  |");
			else if(boca==4)
				System.out.println("4. |  ---  |");
		}
		System.out.println(barbilla);
		
	}
}


