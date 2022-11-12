package dao;

import java.util.List;
import model.UserLogin;

public interface IUserLoginDAO {
	
	/**
     * Lay danh sach dap nhap tai khoan nguoi dung
    */
	List<UserLogin> getAll();
	
	/**
     * Lay 1 tai khoan dap nhap cua nguoi dung theo id
     *
     * @param id
    */
	UserLogin get(int id);
	
	/**
     * Tao dap nhap tai khoan nguoi dung
     *
     * @param username
     * @return
    */
	void save(UserLogin userlogin);
	
	/**
     * Cap nhat dap nhap tai khoan nguoi dung
     *
     * @param username
     * @return
    */
	void update(UserLogin userlogin);
	
	/**
     * Xoa dap nhap tai khoan nguoi dung theo id
     *
     * @param username
     * @return
    */
	void delete(UserLogin id);
}
