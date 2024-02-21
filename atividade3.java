import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		int[] x = new int[10];
		int n,i,achou;

		for(i=0;i<10;i++){
			S
			int a = s1.nextInt();
			x[i] = a;
			s1.nextLine();
		}


		n = 2;
		achou = 0;
		i = 0;

		while(i<=9 && achou==0){
			if(x[i]==n){
				achou = 1;
			}
			else{
				i++;
			}
		}

		if(achou == 0){
			System.out.println("Número não encontrado no vetor.");
		}
		else{
			System.out.println("Numero encontrado na posição "+(i+1));
		}


	}
}