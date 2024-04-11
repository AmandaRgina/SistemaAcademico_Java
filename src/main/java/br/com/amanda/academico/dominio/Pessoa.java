package br.com.amanda.academico.dominio;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@AllArgsConstructor 
@ToString 
@MappedSuperclass
public abstract class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Integer id;
	
	@Getter 
	@Setter 
	private String nome;
	
	@Getter 
	@Setter 
	private String cpf;
	
	@Getter 
	@Setter 
	private String dataNascimento;
	
	@OneToOne
	@JoinColumn(name = "id_endereco", referencedColumnName = "id")
	@Getter 
	@Setter 
	private Endereco endereco;

}
