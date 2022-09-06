package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import repository.UserMovieRepository;
import movies.entities.*;
public class UserMovieService {

	@Autowired
	private UserMovieRepository userMovieRepository;
	
	public Boolean findFav(Integer userid, Integer movieid){
		EntityUserMovie b =  userMovieRepository.findByUserId(userid, movieid).get();
		
		return b.isFavorite();
	}

	public Integer findPersonalRating(Integer userid, Integer movieid){
		EntityUserMovie b =  userMovieRepository.findByUserId(userid, movieid).get();
		
		return  b.getPersonal_rating();
	
	}
	
	public String findNotes(Integer userid, Integer movieid){
		EntityUserMovie b =  userMovieRepository.findByUserId(userid, movieid).get();
		
		return b.getNotes();
	
	}
		
	
}
