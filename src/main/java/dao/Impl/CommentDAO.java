package dao.Impl;

import java.util.List;

import dao.ICommentDAO;
import dao.IHotelDAO;
import dao.JpaEntityManager;
import model.Comment;
import model.Hotel;

public class CommentDAO extends JpaEntityManager implements ICommentDAO{

	@Override
	public List<Comment> getAllComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment getCommentnById(int id) {
		// TODO Auto-generated method stub
		return super.get(Comment.class, id);
	}

	@Override
	public void createComment(Comment comment) {
		// TODO Auto-generated method stub
		super.save(comment);
		
	}

	@Override
	public void updateComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(Comment comment) {
		super.delete(comment);
		
		
	}


}
