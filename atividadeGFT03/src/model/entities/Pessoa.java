package model.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa {
	
	private String nome;
	private String sexo;
	private Date dataNascimento;
	
	private final SimpleDateFormat FORMATACAO = new SimpleDateFormat("dd/MM/yyyy");
	
	// -------------------------------------------------------------------------------------
	
	public Pessoa(String nome, String sexo, String dataNascimento) throws ParseException {
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = FORMATACAO.parse(dataNascimento);
	}
	
	// -------------------------------------------------------------------------------------

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

	public void setDataNascimento(String dataNascimento) throws ParseException {
		this.dataNascimento = FORMATACAO.parse(dataNascimento);
	}
	
	// -------------------------------------------------------------------------------------
	
	public int restanteDeVida() {
		
		long idade = new Date().getTime() - dataNascimento.getTime();
		
		TimeUnit time = TimeUnit.DAYS;
		long dias = time.convert(idade, TimeUnit.MILLISECONDS);
		
		int idadeAnos = (int) dias / 365;
		
		int expectativaVida = 73 - idadeAnos;
		
		if(sexo.toUpperCase().equals("FEMININO")) {
			expectativaVida = 80 - idadeAnos;
		}
		
		return expectativaVida;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " || Data de nascimento:" + FORMATACAO.format(dataNascimento);
	}
	

}
