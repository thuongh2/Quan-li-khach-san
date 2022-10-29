package dao.Impl;

import java.util.List;

import dao.IBookDetailDAO;
import dao.JpaEntityManager;
import model.BookDetail;

public class BookDetailDAO extends JpaEntityManager implements IBookDetailDAO{

	@Override
	public List<BookDetail> getAll() {
		// TODO Auto-generated method stub
		return super.getAll(BookDetail.class);
	}

	@Override
	public BookDetail get(int id) {
		// TODO Auto-generated method stub
		return super.get(BookDetail.class, id);
	}

	@Override
	public void save(BookDetail bookdetail) {
		super.save(bookdetail);
		
	}

	@Override
	public void saveOrUpdate(BookDetail bookdetail) {
		super.saveOrUpdate(bookdetail);
		
	}

	@Override
	public void delete(int id) {
		super.delete(id);
	}


}
