package opet.aulatds171a.main;

import java.util.Date;

import opet.aulatds171a.pessoa.Pessoa;
import opet.aulatds171a.utilitario.Leitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = Leitor.readString("Entre com o nome:");
		String sexo = Leitor.readString("Entre com o sexo:");
		String dataNascimento = Leitor.readString("Entre com oa data de nascimento:");
		
		Pessoa novaPessoa = new Pessoa(nome, sexo,
				new Date(dataNascimento) );
		
		System.out.println("Nome:"+novaPessoa.getNome());
		System.out.println("Sexo:"+novaPessoa.getSexo());
		System.out.println("Nome:"+novaPessoa.getDataNascimento());
		

	}

}
