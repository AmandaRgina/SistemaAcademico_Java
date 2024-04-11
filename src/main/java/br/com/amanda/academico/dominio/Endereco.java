package br.com.amanda.academico.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
public class Endereco {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter 
	private Integer id;
	
	@Getter 
	@Setter 
	private String cep;
	
	@Getter 
	@Setter 
	private String rua;
	
	@Getter 
	@Setter 
	private String numero;
	
	@Getter 
	@Setter 
	private String cidade;
	
	@Getter 
	@Setter 
	private String estado;
	
	
	

}
