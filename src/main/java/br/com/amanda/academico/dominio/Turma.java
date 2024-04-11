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
public class Turma {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter 
	private Integer codigo;
	
	@Getter 
	@Setter 
	private Integer dataInicio;
	

}
