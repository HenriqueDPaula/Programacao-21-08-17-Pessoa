package opet.aulatds171a.pessoa;
import java.util.Date;

public class Pessoa {

	private String nome = "";
	private String sexo = "";
	private Date dataNascimento;
	
	public Pessoa()
	{
		
	}
	
	public Pessoa(String nome, String sexo, Date dataNascimento)
	{
		this.setNome(nome);
		this.setSexo(sexo);
		this.setDataNascimento(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
