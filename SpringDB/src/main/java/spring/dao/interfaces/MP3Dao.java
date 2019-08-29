package spring.dao.interfaces;

import java.util.List;

import spring.dao.objects.MP3;

public interface MP3Dao {


	
	int insert(MP3 mp3);
	
	void delete(MP3 mp3);
	
	void deleteById(int id);
	
	void insert(List<MP3> mp3List);
	
	int insertList(List<MP3> mp3List);
	
	int[] batchUpdate(List<MP3> mp3List);
	
	int getMP3Count();
	
	MP3 getMP3ByID(int id);
	
	List<MP3> getMP3ListByName(String name);
	
	List<MP3> getMP3ListByAuthor(String author);

}
