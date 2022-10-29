package dao;

import java.util.List;

import model.BookDetail;

public interface IBookDetailDAO {
	
	/**
     * Xuat danh sach chi tiet dat phong
    */
	List<BookDetail> getAll();
	
	/**
     * Lay 1 chi tiet dat phong theo id
     *
     * @param id
    */
	BookDetail get(int id);
	
	/**
     * Tao chi tiet dat phong
     *
     * @param bookdeail
     * @return
    */
	void save(BookDetail bookdeail);
	
	/**
     * Cap nhat thong tin chi tiet dat phong
     *
     * @param bookdeail
     * @return
    */
	void saveOrUpdate(BookDetail bookdeail);
	
	/**
     * Xoa chi tiet dat phong theo id
     *
     * @param bookdeail
     * @return
    */
	void delete(int id);
}
