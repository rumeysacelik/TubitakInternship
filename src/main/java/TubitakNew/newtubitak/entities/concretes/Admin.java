package TubitakNew.newtubitak.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name="admin")

@AllArgsConstructor
@Getter
@Setter

public class Admin{
	
	public Admin() {
    }

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
	
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		@Column(name="adminid" )
		private long adminId;

		@Column(name="userName")
		private  String userName;
		
		@Column(name="password")
	    private  String password;
	    
	    
	    
}
