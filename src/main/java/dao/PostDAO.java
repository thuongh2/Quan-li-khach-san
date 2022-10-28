package dao;

import java.util.List;

import model.Post;

public interface PostDAO {
	
	
	List<Post> getAll();
	
	Post getById(int id);
	
	Post getByName(String name);
	
	void create(Post post);
	
	void update(Post post);
	
	void delete(int id);

}
