package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "book_detail")
public class BookDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private User userDatLich;
	
	
}
