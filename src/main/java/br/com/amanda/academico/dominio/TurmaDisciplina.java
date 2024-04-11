package br.com.amanda.academico.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@NoArgsConstructor 
@AllArgsConstructor 
@ToString 
public class TurmaDisciplina {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter 
	private Integer id;
	
	@Getter 
	@Setter 
	private Integer sala;
	
	@Getter 
	@Setter 
	private Integer horario;
	
	@OneToOne
	@JoinColumn(name = "codigo_disciplina", referencedColumnName = "codigo")
	@Getter 
	@Setter 
	private Disciplina disciplina;
	
	@OneToOne
	@JoinColumn(name = "codigo_turma", referencedColumnName = "codigo")
	@Getter 
	@Setter 
	private Turma turma;

}
