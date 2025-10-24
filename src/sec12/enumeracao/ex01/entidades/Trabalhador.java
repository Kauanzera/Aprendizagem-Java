package sec12.enumeracao.ex01.entidades;

import java.util.ArrayList;
import java.util.List;

import sec12.enumeracao.ex01.entidades.enums.NivelTrabalhador;

public class Trabalhador {
	
	//Atributos básicos
	private String nome;
	private NivelTrabalhador nivel;
	private Double salBase;
	
	//Associações
	private Departamento departamento;								//'1' Departamento
	private List<HoraContrato> contratos = new ArrayList<>();		//'N' contratos

	//Construtores
	public Trabalhador() {}
	public Trabalhador(String nome, NivelTrabalhador nivel, Double salBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salBase = salBase;
		this.departamento = departamento;
	}

	//Métodos acessores
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public NivelTrabalhador getNivel() {
		return nivel;
	}
	
	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}
	
	public Double getSalBase() {
		return salBase;
	}
	
	public void setSalBase(Double salBase) {
		this.salBase = salBase;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public List<HoraContrato> getContratos() {
		return contratos;
	}
	
	//Métodos
	public void addContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(int ano, int mes) {
		double sum = salBase;					//Variável temporária armazenando o valor da renda para ser somada
		
		for (HoraContrato c : contratos) {
			
			//Váriaveis usadas para acessar a classe 'HoraContrato' e obter o mês e o ano do contrato para verificar se batem com o da pesquisa
			int c_ano = c.getDate().getYear();
			int c_mes = c.getDate().getMonthValue();
			
			if (c_ano == ano && c_mes == mes) {
				sum += c.valTotal();
			}
			
		}
		return sum;
	}
		
}
