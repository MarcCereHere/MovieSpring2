package movies.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import movies.entities.EntityCast;
import movies.entities.EntityCastAndCrew;
import movies.entities.EntityImages;
import movies.entities.EntityBackdrops;
import movies.entities.EntityKeywords;
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
		public List<EntityCastAndCrew> getMovieCreditsById(@PathVariable Integer movie_id) throws IOException{
			return movieService.getMovieCreditsById(movie_id);
		}
		
		@GetMapping("api/movie/{movie_id}/images")
		public List<EntityImages> getMovieImages(@PathVariable Integer movie_id) throws IOException{
			return movieService.getMovieImages(movie_id);
		}
		
		
		
		@GetMapping("api/movie/{movie_id}/keywords")
		public List<EntityKeywords> getMovieKeywords(@PathVariable Integer movie_id) throws IOException{
			return movieService.getMovieKeywords(movie_id);
		}
		
		
		@GetMapping("api/movie/{movie_id}/similar")
		public List<EntityMovies> getMovierecommendations(@PathVariable Integer movie_id) throws IOException{
			return movieService.getMovierecommendations(movie_id);
		}
		
		
	}