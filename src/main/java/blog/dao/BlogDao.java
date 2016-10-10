package blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import blog.domain.PostForm;

public interface BlogDao {
	public List<PostForm> selectAllBlog(); 
	public void deleteBlog(@Param(value = "id") int id);
	public void createNewBlog(@Param(value= "postForm") PostForm postForm);
	public PostForm selectBlogById(@Param(value= "id") int id);
	public void updateBlogById(@Param(value= "id") int id, @Param(value="postForm") PostForm postForm);
}
