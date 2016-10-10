package blog.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import blog.domain.PostForm;
import blog.service.BlogService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private final static Logger Logger = LoggerFactory.getLogger(CommonController.class);
	private BlogService blogService;
	
	@Autowired
	public AdminController(BlogService blogService) {
		this.blogService = blogService;
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public String deleteBlogById(@PathVariable int id){
		
		blogService.deleteBlog(id);
		Logger.info("已删除id为"+id+"的博客");
		return "redirect:/common/";
	}
	@RequestMapping(value = "/create/", method = RequestMethod.POST, consumes = "application/json")
	public String createBlog(@RequestBody PostForm postData){
		blogService.createNewBlog(postData);
		return "redirect:/common/";
	}
	@RequestMapping(value = "/update/", method = RequestMethod.POST, consumes = "application/json")
	public String updateBlog(@RequestBody PostForm postData){
		Logger.info(postData.toString());
		blogService.updateBlogById(postData.getid(), postData);
		return "redirect:/common/";
	}
}
