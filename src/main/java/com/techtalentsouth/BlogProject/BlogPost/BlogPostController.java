package com.techtalentsouth.BlogProject.BlogPost;

import org.springframework.stereotype.Controller;

@Controller
public class BlogPostController {

	public String index(BlogPost blogPost) {
		return "blogpost/index";
	}
}
