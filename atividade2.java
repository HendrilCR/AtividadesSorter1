import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		int[] array = new int[10];
		int i,z;
		int maior,menor;
		int vezes = 0;

		for(i=0;i<10;i++){
			System.out.println("Digite o "+(i+1)+"º número:");
			array[i] = s1.nextInt();
			s1.nextLine();
			}


		for(z=0;z<10;z++){
				menor = array[z];
				int indexMenor = z;
				for(i=z;i<10;i++){
					if (array[i] < menor){
						indexMenor = i;
						menor = array[i];
						}
					}
				int temp = array[z];
				array[z] = array[indexMenor];
				array[indexMenor] = temp;}


		menor = array[0];
		for (int a:array){System.out.print(a+" ");if(a==menor){vezes++;}}
		System.out.println();
		System.out.println(menor+" - é o menor e aparece ( "+vezes+" ) vezes.");

		vezes = 0;
		maior = array[9];
		for (int a:array){if(a==maior){vezes++;}}
		System.out.println(maior+" - é o maior e aparece ( "+vezes+" ) vezes.");

	}
}
