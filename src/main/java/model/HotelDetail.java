package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "hotel_detail")
public class HotelDetail implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private float area;
	
	private int numberRom;
	
	private String address;
	
	private float price;
	
	private String desc;
	
	@OneToOne
	private Post post;
	

}
