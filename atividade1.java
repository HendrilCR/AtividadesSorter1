import java.util.Scanner;

class Main{
	public static void main(String[] args){
	Scanner s1 = new Scanner(System.in);
	Sorter st = new Sorter();
	int tamanho = 5;

	Funcionario[] funcionarios = new Funcionario[tamanho];
	int i;

	for(i=0;i<tamanho;i++){
		System.out.println("Digite o nome do funcionário:");
		String nome = s1.nextLine();

		System.out.println("Digite o salário do funcionário:");
		Double salario = s1.nextDouble();
		s1.nextLine();
		funcionarios[i] = new Funcionario(nome,salario);
	} //Cria e preenche Funcionarios
	
	st.bubble(funcionarios);
	st.select(funcionarios);
	st.insert(funcionarios);

	


	}
}

class Funcionario{
	String nome;
	double salario;

	Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}

	public void mostrar(){
		System.out.print(nome+"-");
		System.out.println(salario);
	}}

class Sorter{
	private int i,z;

	public void bubble(Funcionario[] func){
		for(z=0;z<4;z++){
			for(i=0;i<4;i++){
				if (func[i].salario > func[i+1].salario){
					Funcionario f = func[i];
					func[i] = func[i+1];
					func[i+1] = f;
				}
			}
		}

	System.out.println("Bubble Sort - Crescente:");
	for(Funcionario f: func){f.mostrar();}
	System.out.println("-----------------------------------------");

	System.out.println("Bubble Sort - Decrescente:");
	for(i=4;i>-1;i--){func[i].mostrar();}
	System.out.println("-----------------------------------------");
	}

	public void select(Funcionario[] func){
		
		
		for(z=0;z<5;z++){
			double menor = func[z].salario;
			int indexMenor = z;
			for(i=z;i<5;i++){
				if (func[i].salario < menor){
					indexMenor = i;
					menor = func[i].salario;
					}
				}
			Funcionario temp = func[z];
			func[z] = func[indexMenor];
			func[indexMenor] = temp;}

		System.out.println("Selection Sort - Crescente:");
		for(Funcionario f: func){f.mostrar();}
		System.out.println("-----------------------------------------");

		System.out.println("Selection - Decrescente:");
		for(i=4;i>-1;i--){func[i].mostrar();}
		System.out.println("-----------------------------------------");

		}

	public void insert(Funcionario[] func){

		for(z=1;z<5;z++){
			for(i=z;i>0;i--){
				if (func[i].salario < func[i-1].salario){
					Funcionario temp = func[i];
					func[i] = func[i-1];
					func[i-1] = temp;}
				else{i=0;}
			}
		}
		System.out.println("Insert Sort - Crescente:");
		for(Funcionario f: func){f.mostrar();}
		System.out.println("-----------------------------------------");

		System.out.println("Selection - Decrescente:");
		for(i=4;i>-1;i--){func[i].mostrar();}
		System.out.println("-----------------------------------------");

	}

}