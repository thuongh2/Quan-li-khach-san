package dao;

import java.util.List;

import model.BookDetail;

public interface BookDetailDAO {
	
	/**
     * Xuat danh sach chi tiet dat phong
    */
	List<BookDetail> getAllBookDetail();
	
	/**
     * Lay 1 chi tiet dat phong theo id
     *
     * @param id
    */
	BookDetail getBookDetailById(int id);
	
	/**
     * Tao chi tiet dat phong
     *
     * @param bookdeail
     * @return
    */
	void createBookDetail(BookDetail bookdeail);
	
	/**
     * Cap nhat thong tin chi tiet dat phong
     *
     * @param bookdeail
     * @return
    */
	void updateBookDetail(BookDetail bookdeail);
	
	/**
     * Xoa chi tiet dat phong theo id
     *
     * @param bookdeail
     * @return
    */
	void deleteBookDetail(int id);
}
