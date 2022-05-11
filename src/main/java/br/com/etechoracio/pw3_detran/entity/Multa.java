package br.com.etechoracio.pw3_detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name = "Multa")
public class Multa{
	@Id
	@Column(name = "idMulta")
	private int id_multa;

	@Column(name = "dataAplicacao")
	private long dataAplicacao;

	@Column(name = "vencimento")
	private long vencimento;

	@Column(name = "orgao")
	private String orgao;

	@OneToOne
	@Column(name = "idVeiculo")
	private Veiculo veiculo;

	@OneToOne
	@Column(name = "idPessoa")
	private Pessoa condutor;
}