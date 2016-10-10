package blog.domain;

public class PostForm {
	private int id;
	private String title;
	private String content;
	private String tags;
	
	public PostForm(){}
	public void setid(int id){this.id = id;}
	public void settitle(String title){this.title = title;}
	public void setcontent(String content){this.content = content;}
	public void settags(String tags){this.tags = tags;}
	
	public int getid(){return id;}
	public String gettitle(){return title;}
	public String getcontent(){return content;}
	public String gettags(){return tags;}
	
	@Override
	public String toString(){
		return "id:"+ this.id + "title:" + this.title + " content:" + this.content + " tags:" +this.tags;
	}
}