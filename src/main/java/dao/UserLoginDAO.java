package dao;

import java.util.List;
import model.UserLogin;

public interface UserLoginDAO {
	
	/**
     * Lay danh sach dap nhap tai khoan nguoi dung
    */
	List<UserLogin> getAllUserLogin();
	
	/**
     * Lay 1 tai khoan dap nhap cua nguoi dung theo id
     *
     * @param id
    */
	UserLogin getUserLoginById(UserLogin id);
	
	/**
     * Tao dap nhap tai khoan nguoi dung
     *
     * @param username
     * @return
    */
	void createUserLogin(UserLogin userlogin);
	
	/**
     * Cap nhat dap nhap tai khoan nguoi dung
     *
     * @param username
     * @return
    */
	void updateUserLogin(UserLogin userlogin);
	
	/**
     * Xoa dap nhap tai khoan nguoi dung theo id
     *
     * @param username
     * @return
    */
	void deleteUserLogin(UserLogin id);
}
