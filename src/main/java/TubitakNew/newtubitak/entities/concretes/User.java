package TubitakNew.newtubitak.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="use_id")
	private int userId;
	
	@Column(name="name")
	public String name;
	
	@Column(name="surname")
	public String surname;
	
	@Column(name="email")
	public String email;
	
	//@OneToMany(mappedBy="users")
	//private List<Lesson> lessons;
	
	

}
