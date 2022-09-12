package TubitakNew.newtubitak.entities.concretes;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="lesson")
@AllArgsConstructor
@NoArgsConstructor
public class Lesson{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="lesson_id")
	private long lessonId;
	
	@Column(name="lessonName")
	private String lessonName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="lessonType")
	private String lessonType;
	
	@Column(name="lessonTime")
	private Timestamp lessonTime;
	
	//@ManyToOne
	//@JoinColumn(name="use_id")
	//private Lesson lesson;
	

}
