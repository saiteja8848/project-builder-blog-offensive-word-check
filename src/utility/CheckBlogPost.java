package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {

	String[] offensiveWords = {
			"chocolate rosebuds",
			"chode",
			"chodes",
			"chota bags",
			"chota bags",
			"cipa",
			"circlejerk",
			"cl1t",
			"cleveland steamer",
			"climax",
			"damn",
			"damned",
			"damnit",
			"darkie",
			"darn"};
	
	
	public boolean checkBlogTitle(Blog blog) {
		
		boolean status=false;
		String[] blogData = blog.getBlogTitle().split(" ");
		for(int i=0;i<blogData.length;i++) {
			for(int j=0;j<offensiveWords.length;j++)
			if(blogData[i].equalsIgnoreCase(offensiveWords[j])) {
				status=true;
				break;
			}
		}
		return status;
	}

	
	public boolean checkBlogDescription(Blog blog) {
	
		boolean status=false;
		String[] blogData = blog.getBlogDescription().split(" ");
		for(int i=0;i<blogData.length;i++) {
			for(int j=0;j<offensiveWords.length;j++)
			if(blogData[i].equalsIgnoreCase(offensiveWords[j])) {
				status=true;
				break;
			}
		}
		return status;		

	}

	
	public boolean checkBlog(Blog blog) {
		if(checkBlogTitle(blog)&&checkBlogDescription(blog))
			return true;
		else	
		   return false;
	}
	
}