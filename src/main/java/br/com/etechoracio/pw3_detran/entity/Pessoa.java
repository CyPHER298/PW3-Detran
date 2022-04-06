package br.com.etechoracio.pw3_detran.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table (name = "pessoa")
public class Pessoa {
	
	
	@Id
	@Column (name = "idPessoa")
	private String id_Pessoa;
	
	@Column (name = "nome")
	private String nome;
	
	@Column (name = "endereco")
	private String endereco;
	


}
