package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private String likes;
	
	private List<Comments> comments = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date moment, String title, String content, String likes) {

		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public List<Comments> getComments() {
		return comments;
	}
	
	public void addComment(Comments comment) {
		comments.add(comment);
	}
	public void addRemove(Comments comment) {
		comments.add(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(this.likes);
		sb.append(" likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(this.content + " \n");
		sb.append("Comments: \n");
		
		for(Comments c : comments) {
			sb.append(c.getText() + " ");
		}
		return sb.toString();
	}
	
}
