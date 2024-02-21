import java.util.Scanner; //Incompleto

class Main{
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		int tamanho = 3;
		int[] x = new int[tamanho];
		int rep = 0;
		int i = 0;
		int achou = 0;
		int repetiu,n,z,k,num = 0;
		int numero = 0;

		for(z=0;z<tamanho;z++){
			rep = 0;
			while(rep == 0){
				System.out.print("Digite um valor: ");
				numero = s1.nextInt();
				s1.nextLine();
				for(k=0;k<tamanho;k++){
					num = x[k];
					if(num == numero){
						rep=1;
						n = numero;
						achou = 0;
						i = 0;
						while(i<=tamanho-1 && achou==0){
							if(x[i]==n){
								System.out.println(n+" está na posição "+i);
								achou = 1;
							}
							else{
								i++;
							}
						}}
				}
				if (rep==1){System.out.println("Digite um valor válido!");}
				else{x[z]=numero;}
			
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