package movies.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

public class EntityUserMovie {

	@ManyToMany
	@JoinColumn(name="userid")
	EntitysUsers user;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
	
	
	
	
    public EntityUserMovie() {
		super();
	}
    
	private boolean favorite;
    private int personal_rating;
    private String notes;
	public EntityUserMovie(EntitysUsers user, int movieId, boolean favorite, int personal_rating, String notes) {
		super();
		this.user = user;
		this.movieId = movieId;
		this.favorite = favorite;
		this.personal_rating = personal_rating;
		this.notes = notes;
	}
	public EntitysUsers getUser() {
		return user;
	}
	public void setUser(EntitysUsers user) {
		this.user = user;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public int getPersonal_rating() {
		return personal_rating;
	}
	public void setPersonal_rating(int personal_rating) {
		this.personal_rating = personal_rating;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	@Override
	public String toString() {
		return "EntityUserMovie [user=" + user + ", movieId=" + movieId + ", favorite=" + favorite
				+ ", personal_rating=" + personal_rating + ", notes=" + notes + "]";
	}
    
    
}
