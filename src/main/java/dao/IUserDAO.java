package dao;

import java.util.List;

import model.User;


public interface IUserDAO {
	/**
     * Xuat danh sach nguoi dung
    */
	List<User> getAllUser();
	
	/**
     * Lay 1 nguoi dung theo id
     *
     * @param id
    */
	User getUserById(int id);
	
	/**
     * Kiem tra co nguoi dung theo ten
     *
     * @param username
     * @return
    */
	boolean hasUserWithUserName(String username);
	
	/**
     * Tao nguoi dung moi
     *
     * @param user
     * @return
    */
	void createUser(User user);
	
	/**
     * Cap nhat thong tin thong tin nguoi dung
     *
     * @param user
     * @return
    */
	void updateUser(User user);
	
	/**
     * Xoa nguoi dung theo id
     *
     * @param id
     * @return
    */
	void deleteUser(int id);
}
