import java.util.ArrayList;
import java.util.List;

import Entidades.Pessoa;
import Repositorio.RepositorioPessoa;

public class Teste {
	private static RepositorioPessoa rp = new RepositorioPessoa();

	public static void main(String[] args) {

		popularArray();
		listarPessoas();
		rp.deletarPessoaPorID(2);
		listarPessoas();
		alterar();
		listarPessoas();
	}
	
	public static void alterar(){
		
		Pessoa pessoa = new Pessoa();
		pessoa.setApelido("Dé");
		pessoa.setId(3);
		pessoa.setIdade(29);
		pessoa.setNome("André");
		rp.alteraPessoa(pessoa);
	}

	public static void popularArray() {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setApelido("Apo");
		pessoa1.setId(1);
		pessoa1.setIdade(25);
		pessoa1.setNome("Apoena");
		rp.salvaPessoa(pessoa1);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setApelido("Kaka");
		pessoa2.setId(2);
		pessoa2.setIdade(03);
		pessoa2.setNome("Kairon");
		rp.salvaPessoa(pessoa2);

		Pessoa pessoa = new Pessoa();
		pessoa.setApelido("Nara");
		pessoa.setId(3);
		pessoa.setIdade(16);
		pessoa.setNome("Amanara");
		rp.salvaPessoa(pessoa);
		
	
	}

	public static void listarPessoas() {

		List<Pessoa> lista = new ArrayList<Pessoa>();

		lista = rp.listarPessoa();

		for (Pessoa pessoa : lista) {

			System.out.println("Id : " + pessoa.getId());
			System.out.println("Nome : " + pessoa.getNome());
			System.out.println("Apelido : " + pessoa.getApelido());
			System.out.println("Idade : " + pessoa.getIdade());
			System.out.println("--------------------------------------");

		}

	}

}
