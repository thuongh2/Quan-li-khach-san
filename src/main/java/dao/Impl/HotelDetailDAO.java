package dao.Impl;

import java.util.List;

import dao.IHotelDetailDAO;
import dao.JpaEntityManager;
import model.Hotel;
import model.HotelDetail;

public class HotelDetailDAO extends JpaEntityManager implements IHotelDetailDAO {

	@Override
	public List<HotelDetail> getAllHotelDetail() {
		// TODO Auto-generated method stub
		return super.getAll(HotelDetail.class);
	}

	@Override
	public HotelDetail getHotelDetailById(int id) {
		// TODO Auto-generated method stub
		return super.get(HotelDetail.class, id);
	}

	@Override
	public void createHotelDetail(HotelDetail hoteldetail) {
		super.save(hoteldetail);
		
	}

	@Override
	public void updateHotelDetail(HotelDetail hoteldetail) {
		super.saveOrUpdate(hoteldetail);
		
	}

	@Override
	public void deleteHotelDetail(HotelDetail hotel) {
		super.delete(hotel);
		
	}

}
