package br.com.amanda.academico.dominio;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
@PrimaryKeyJoinColumn(name = "matricula")
public class Estudante extends Pessoa{
	
	@Getter 
	private Integer matricula;
	
	@OneToMany
	@JoinColumn(name = "id_turma_disciplina", referencedColumnName = "id")
	@Getter 
	@Setter
	private List<TurmaDisciplina> turmasDisciplinas;

}
