package model;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "post")
public class Post implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Date createDate;
	
	private String content;
	
	private String image;
	
	@OneToMany
	private List<Comment> comment;
	
	@OneToOne
	private HotelDetail hotelDetail;
	
}
