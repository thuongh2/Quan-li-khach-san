package dao;

import java.util.List;

import model.User;


public interface IUserDAO {
	/**
     * Xuat danh sach nguoi dung
    */
	List<User> getAll();
	
	/**
     * Lay 1 nguoi dung theo id
     *
     * @param id
    */
	User get(int id);
	
	/**
     * Kiem tra co nguoi dung theo ten
     *
     * @param name
     * @return
    */
	User getByName(String name);
	
	/**
     * Tao nguoi dung moi
     *
     * @param user
     * @return
    */
	void save(User user);
	
	/**
     * Cap nhat thong tin thong tin nguoi dung
     *
     * @param user
     * @return
    */
	void saveOrUpDate(User user);
	
	/**
     * Xoa nguoi dung theo id
     *
     * @param id
     * @return
    */
	void delete(User user);
}
