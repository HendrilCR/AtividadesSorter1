import java.util.Scanner;

class Main{
	public static void main(String[] args){
	Scanner s1 = new Scanner(System.in);
	Sorter st = new Sorter();
	int tamanho = 3;

	Aluno[] alunos = new Aluno[tamanho];
	int i;

	for(i=0;i<tamanho;i++){
		System.out.println("Digite o nome do aluno:");
		String nome = s1.nextLine();

		System.out.println("Digite a primeira nota do aluno:");
		Double nota1 = s1.nextDouble();
		s1.nextLine();

		System.out.println("Digite a segunda nota do aluno:");
		Double nota2 = s1.nextDouble();
		s1.nextLine();

		alunos[i] = new Aluno(nome,nota1,nota2);
		alunos[i].mostrar();
	} //Cria e preenche Funcionarios
	
	alunos = st.bubble(tamanho,alunos);
	System.out.println("Lista de Alunos, ordenados pela média:");
	for(Aluno a:alunos){a.mostrar();}

	alunos = st.bubble2(tamanho,alunos);
	System.out.println("Lista de Alunos, ordenados pela nota 1:");
	for(Aluno a:alunos){a.mostrar();}

	}
}

class Aluno{
	String nome;
	double nota1;
	double nota2;
	double media;

	Aluno(String nome, double nota1, double nota2){
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		media = ((nota1*2)+(nota2*3))/6;


	}

	public void mostrar(){
		System.out.print(nome+"(");
		System.out.print(nota1+" e ");
		System.out.print(nota2+") - Média: ");
		System.out.println(media);
	}}

class Sorter{
	private int i,z;

	public Aluno[] bubble(int tamanho,Aluno[] alu){
		for(z=0;z<tamanho-1;z++){
			for(i=0;i<tamanho-1;i++){
				if (alu[i].media > alu[i+1].media){
					Aluno f = alu[i];
					alu[i] = alu[i+1];
					alu[i+1] = f;
				}
			}
		}
	return alu;}

	public Aluno[] bubble2(int tamanho,Aluno[] alu){
		for(z=0;z<tamanho-1;z++){
			for(i=0;i<tamanho-1;i++){
				if (alu[i].nota1 > alu[i+1].nota1){
					Aluno f = alu[i];
					alu[i] = alu[i+1];
					alu[i+1] = f;
				}
			}
		}
	return alu;}

}