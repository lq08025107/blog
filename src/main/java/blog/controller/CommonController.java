package blog.controller;

import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import blog.domain.PostForm;
import blog.service.BlogService;

@Controller
@RequestMapping("/common")
public class CommonController {
	private final static Logger Logger = LoggerFactory.getLogger(CommonController.class);
	private BlogService blogService;
	
	@Autowired
	public CommonController(BlogService blogService) {
		this.blogService = blogService;
	}
	
	@RequestMapping(value="/")
	@ResponseBody
	public List<PostForm> getAllBlogs(){
		Logger.info("list all blog");
		List<PostForm> allBlog = blogService.selectAllBlog();
		return allBlog;
	}
	@RequestMapping(value="/getBlogById", method=RequestMethod.GET)
	@ResponseBody
	public PostForm getBlogById(@RequestParam int id){
		Logger.info("list blog");
		
		PostForm Blog = blogService.selectBlogById(id);
		Logger.info(Blog.toString());
		return Blog;
	}
}