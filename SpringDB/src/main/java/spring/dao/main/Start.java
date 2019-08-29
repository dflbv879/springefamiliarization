package spring.dao.main;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.impls.SQLiteDAO;
import spring.dao.objects.MP3;

public class Start {

	public static void main(String[] args) {
		MP3 mp1 = new MP3();
		mp1.setName("Song fdsfdsf");
		mp1.setId(3);
		mp1.setAuthor("Justin 1111111111111111111111111111");
		MP3 mp2 = new MP3();
		mp2.setName("fds klkk");
		mp2.setId(2);
		mp2.setAuthor("Jfdsustin fdsg");
		
		ArrayList<MP3> list = new ArrayList<MP3>();
		list.add(mp1);
		list.add(mp2);
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SQLiteDAO sqLiteDAO = (SQLiteDAO)context.getBean("sqliteDAO");
		System.out.println(sqLiteDAO.batchUpdate(list));
	}
	
}
