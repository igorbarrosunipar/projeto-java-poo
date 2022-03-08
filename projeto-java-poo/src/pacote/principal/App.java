package pacote.principal;

import pacote.classe.Aluno;

public class App {
	
	/* Main � um m�todo auto execut�vel em Java */
	public static void main(String[] args) {
		
		/* Objeto n�o est� na mem�ria, ele n�o existe */
		Aluno aluno1;
		
		/* Objeto est� na mem�ria, new = cria um novo objeto */
		Aluno aluno2 = new Aluno(); /* Aqui ser� Maria */
		
		Aluno aluno3 = new Aluno(); /* Aqui ser� o Jos� */
		
		Aluno aluno4 = new Aluno("Maria"); // Passando objeto com valor padr�o com um param�tro.
		
		Aluno aluno5 = new Aluno("Jos�", 34); // H� v�rias tipos de m�todos construtores.
	}
}
