package br.com.amanda.academico.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@AllArgsConstructor 
@NoArgsConstructor 
@ToString
@PrimaryKeyJoinColumn(name = "codigo")
public class Professor extends Pessoa{
	
	
	@Getter 
	private Integer codigo;
	
	@Getter 
	@Setter 
	private String titulacao;
	
	
	@Getter 
	@Setter 
	@OneToOne
	@JoinColumn(name = "id_turma_disciplina", referencedColumnName = "id")
	private TurmaDisciplina turmasDisciplinas;

}
