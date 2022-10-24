package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Date paymentDate;
	
	private double paymentPrice;
	
	private String paymentOption;
	

}
