package movies.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import movies.entities.EntityCrew;
import movies.entities.EntityGenre;
import movies.entities.EntityImage;
import movies.entities.EntityKeywords;
import movies.entities.EntityMovies;

	
	@Service
	public class movieService {
		
		final String uri = "https://api.themoviedb.org/3/";
	    final String apiKey = "cbc2e858465abc7e8dd36fa2da967675";
	   

		 public StringBuilder createStringBuilder(URL url) throws IOException {

		        InputStream input = url.openStream();
		        InputStreamReader isr = new InputStreamReader(input);
		        BufferedReader reader = new BufferedReader(isr);
		        StringBuilder stringBuilder = new StringBuilder();
		        int c ;
		        while((c= reader.read())!=-1){
		        	stringBuilder.append((char)c);
		        }

		       return stringBuilder;
		   } 
		 
		 
		 public List<EntityMovies> findMoviePopular() throws IOException {
		 
			 ObjectMapper mapper = new ObjectMapper();
		     URL url = new URL(uri+"movie/popular?api_key="+apiKey);
			 
			 StringBuilder json =  createStringBuilder(url);
			 EntityMovies[] response  = mapper.readValue(mapper.readTree(json.toString()).get("results").toString(),EntityMovies[].class);
			 
			 return Arrays.asList(response);
		 }
		 
		 public List<EntityMovies> findTopRated() throws IOException{
			 ObjectMapper mapper = new ObjectMapper();
			 
			 URL url = new URL(uri+"movie/top_rated?api_key="+apiKey);
			 
			 StringBuilder stringBuilder = createStringBuilder(url);
			 EntityMovies[] response  = mapper.readValue(mapper.readTree(stringBuilder.toString()).get("results").toString(),EntityMovies[].class);
			 
			 return Arrays.asList(response);
		 }
		 
		 public EntityMovies findMovieById(Integer Id) throws IOException{
			 ObjectMapper mapper = new ObjectMapper();
			 
			 URL url = new URL(uri+"movie/" + Id + "?api_key="+apiKey);
			 
			 StringBuilder stringBuilder = createStringBuilder(url);
			 mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);
			 EntityMovies response = mapper.readValue(stringBuilder.toString(), EntityMovies.class);
			 
			 return response;
		 }
		 
		 public List<EntityCrew> getMovieCreditsById(Integer Id) throws IOException{
			 ObjectMapper mapper = new ObjectMapper();
			 
			 URL url = new URL(uri+"movie/" + Id + "/credits?api_key="+apiKey);
			 
			 StringBuilder stringBuilder = createStringBuilder(url);
			 EntityCrew[] response  = mapper.readValue(mapper.readTree(stringBuilder.toString()).get("cast").toString(),EntityCrew[].class);
			 
			 return Arrays.asList(response);
		 }
		 
		 public List<EntityImage> getMovieImages(Integer Id) throws IOException{
			 ObjectMapper mapper = new ObjectMapper();
			 
			 URL url = new URL(uri+"movie/" + Id + "/images?api_key="+apiKey);

			 
			 StringBuilder stringBuilder = createStringBuilder(url);
			 EntityImage[] response  = mapper.readValue(mapper.readTree(stringBuilder.toString()).get("backdrops").toString(),EntityImage[].class);
			 
			 return Arrays.asList(response);
		 }
		 
		 public List<EntityKeywords> getMovieKeywords(Integer Id) throws IOException{
			 ObjectMapper mapper = new ObjectMapper();
			 
			 URL url = new URL(uri+"movie/" + Id + "/keywords?api_key="+apiKey);

			 
			 StringBuilder stringBuilder = createStringBuilder(url);
			 EntityKeywords[] response  = mapper.readValue(mapper.readTree(stringBuilder.toString()).get("keywords").toString(),EntityKeywords[].class);
			 
			 return Arrays.asList(response);
		 }
		 
		 public List<EntityMovies> getMovierecommendations(Integer Id) throws IOException{
			 ObjectMapper mapper = new ObjectMapper();
			 
			 URL url = new URL(uri+"movie/" + Id + "/recommendations?api_key="+apiKey);

			 
			 StringBuilder stringBuilder = createStringBuilder(url);
			 EntityMovies[] response  = mapper.readValue(mapper.readTree(stringBuilder.toString()).get("results").toString(),EntityMovies[].class);
			 
			 return Arrays.asList(response);
		 }
		 
		 public List<EntityMovies> getMovieSimilar(Integer Id) throws IOException{
			 ObjectMapper mapper = new ObjectMapper();
			 
			 URL url = new URL(uri+"movie/" + Id + "/similar?api_key="+apiKey);

			 
			 StringBuilder stringBuilder = createStringBuilder(url);
			 EntityMovies[] response  = mapper.readValue(mapper.readTree(stringBuilder.toString()).get("results").toString(),EntityMovies[].class);
			 
			 return Arrays.asList(response);
		 }
	}


