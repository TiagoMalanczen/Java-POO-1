package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comments;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments("Have a nive trip!");
		Comments c2 = new Comments("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traving to new Zila", "I'going to visit this wordeful country", "12"); 
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}
}
