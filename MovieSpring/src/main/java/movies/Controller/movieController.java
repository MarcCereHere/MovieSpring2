package movies.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import movies.entities.EntityMovies;
import movies.services.*;

	@RestController
	public class movieController {

		
		@Autowired
		movieService movieService;
		
		@GetMapping("/api/popular/movie/list")
		public List<EntityMovies> getPopular() throws IOException{
			return movieService.findMoviePopular();
		}
		
		@GetMapping("/api/topRated/movie/list")
		public List<EntityMovies> getTopRated() throws IOException{
			return movieService.findTopRated();
		}
		

		@GetMapping("api/movie/{movie_id}")
	    public EntityMovies getMoviesById(@PathVariable Integer movie_id) throws IOException {
	        return movieService.findMovieById(movie_id);
	    }
		
		@GetMapping("api/movie/{movie_id}/credits")
		public EntityMovies getMovieCreditsById(@PathVariable Integer movie_id) throws IOException {
	        return movieService.getMovieCreditsById(movie_id);
	    }
	}