package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_login")
public class UserLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String username;
	
	private String password;
	
	@OneToOne
	private User user;

}
