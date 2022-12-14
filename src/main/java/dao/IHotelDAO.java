package dao;

import java.util.List;

import model.Hotel;

public interface IHotelDAO {
	
	List<Hotel> getAll();
	
	Hotel get(int id);
	
	
	void save(Hotel post);
	
	void saveOrUpdate(Hotel post);
	
	void delete(Hotel hotel);

}
