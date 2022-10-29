package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class HotelDetail implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private double area;

	private int numberRoom;

	private String address;

	private double price;

	private String description;

	@OneToOne
	private Hotel post;

	// 1 nhà trọ có nhiều người đặt lịch
	@OneToMany
	private List<BookDetail> bookDetail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String desc) {
		this.description = desc;
	}

	public Hotel getPost() {
		return post;
	}

	public void setPost(Hotel post) {
		this.post = post;
	}

}
