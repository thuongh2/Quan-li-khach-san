package dao;

import java.util.List;

import model.HotelDetail;

public interface HotelDetailDAO {
	/**
     * Xuat danh sach chi tiet phong
    */
	List<HotelDetail> getAllHotelDetail();
	
	/**
     * Lay 1 chi tiet phong theo id
     *
     * @param id
    */
	HotelDetail getHotelDetailById(int id);
	
	/**
     * Tao chi tiet phong moi
     *
     * @param hoteldetail
     * @return
    */
	void createHotelDetail(HotelDetail hoteldetail);
	
	/**
     * Cap nhat thong tin chi tiet phong moi
     *
     * @param hoteldetail
     * @return
    */
	void updateHotelDetail(HotelDetail hoteldetail);
	
	/**
     * Xoa chi tiet phong moi
     *
     * @param id
     * @return
    */
	void deleteHotelDetail(int id);
}
