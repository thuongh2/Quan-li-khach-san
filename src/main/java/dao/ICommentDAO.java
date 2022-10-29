package dao;

import java.util.List;

import model.Comment;

public interface ICommentDAO {
	
	/**
     * Xuat danh sach binh luanj
    */
	List<Comment> getAllComment();
	
	/**
     * Lay 1 binh luan theo id
     *
     * @param id
    */
	Comment getCommentnById(int id);
	
	/**
     * Tao binh luan moi
     *
     * @param comment
     * @return
    */
	void createComment(Comment comment);
	
	/**
     * Cap nhat thong tin binh luan
     *
     * @param comment
     * @return
    */
	void updateComment(Comment comment);
	
	/**
     * Xoa binh luan theo id
     *
     * @param id
     * @return
    */
	void deleteComment(int id);
}
