package blog.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blog.dao.BlogDao;
import blog.domain.PostForm;
@Service
public class BlogService {
	private BlogDao blogDao;
	
	@Autowired
	public BlogService(BlogDao blogDao){
		this.blogDao = blogDao;
	}
	
	public List<PostForm> selectAllBlog(){
		List<PostForm> all = blogDao.selectAllBlog();
		return all;
	}
	
	public void deleteBlog(int id){
		blogDao.deleteBlog(id);
	}
	
	public void createNewBlog(PostForm postForm){
		blogDao.createNewBlog(postForm);
	}
	
	public PostForm selectBlogById(int id){
		PostForm postForm = blogDao.selectBlogById(id);
		return postForm;
	}
	
	public void updateBlogById(int id, PostForm postForm){
		blogDao.updateBlogById(id, postForm);
	}
}
