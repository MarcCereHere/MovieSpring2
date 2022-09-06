package movies.entities;

import java.util.List;

public class EntityImages {

	
	    public List<EntityBackdrops> entityBackdrops;
	    public List<EntityPosters> entityPosters;
	    
	    
	    public EntityImages() {
	        
	    }
	    
	    
	    public List<EntityBackdrops> getEntityBack() {
	        return entityBackdrops;
	    }
	    public void setEntityBack(List<EntityBackdrops> entityBackdrops) {
	        this.entityBackdrops = entityBackdrops;
	    }
	    public List<EntityPosters> getEntityPost() {
	        return entityPosters;
	    }
	    public void setEntityPost(List<EntityPosters> entityposter) {
	        this.entityPosters = entityposter;
	    }
}
