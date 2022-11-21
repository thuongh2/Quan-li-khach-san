package dao;

import java.util.List;

import model.Payment;

public interface IPaymentDAO {
	
	/**
     * Xuat danh sach thanh toan
    */
	List<Payment> getAllPayment();
	
	/**
     * Lay thanh toan theo id
     *
     * @param id
    */
	Payment getPaymentById(int id);
	
	/**
     * Tao thanh toan moi
     *
     * @param payment
     * @return
    */
	void createPayment(Payment payment);
	
	/**
     * Cap nhat thong tin thanh toan
     *
     * @param payment
     * @return
    */
	void updatePayment(Payment payment);
	
	/**
     * Xoa thanh toan theo id
     *
     * @param id
     * @return
    */
	void deletePayment(Payment payment);
}
