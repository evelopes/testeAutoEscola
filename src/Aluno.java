
public class Aluno {
	String nome;
	int idade;
	
	Aluno(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		
	}
	
	void fazOExame() {
		System.out.println(idade > 18 ? "J� pode fazer o exame!" : "N�o pode fazer o exame!");
	}
}
