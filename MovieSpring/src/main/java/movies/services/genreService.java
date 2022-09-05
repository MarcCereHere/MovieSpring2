package movies.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import movies.entities.EntityGenre;

@Service
public class genreService {
	
	final String uri = "https://api.themoviedb.org/3/";
    final String apiKey = "cbc2e858465abc7e8dd36fa2da967675";

	 public List<EntityGenre> findAllGeneres() throws IOException {

	       ObjectMapper mapper = new ObjectMapper();
	       URL url = new URL(uri+"genre/movie/list?api_key="+apiKey);

	        InputStream input = url.openStream();
	        InputStreamReader isr = new InputStreamReader(input);
	        BufferedReader reader = new BufferedReader(isr);
	        StringBuilder json = new StringBuilder();
	        int c ;
	        while((c= reader.read())!=-1){
	            json.append((char)c);
	        }

	        EntityGenre[] response  = mapper.readValue(mapper.readTree(json.toString()).get("genres").toString(),EntityGenre[].class);

	       return Arrays.asList(response);
	   }
	 
}
