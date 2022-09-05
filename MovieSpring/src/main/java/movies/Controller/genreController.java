package movies.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import movies.entities.EntityGenre;
import movies.services.*;

@RestController
public class genreController {

	
	@Autowired
	genreService genreService;
	
	@GetMapping("api/genre/movie/list")
	public List<EntityGenre> getGen()throws IOException {
		return genreService.findAllGeneres();
	}
	//Test
	
}
