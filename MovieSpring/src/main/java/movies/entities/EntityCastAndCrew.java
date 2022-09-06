package movies.entities;

import java.util.List;

public class EntityCastAndCrew {

	 public List<EntityCast> entityCast;
	    public List<EntityCrew> entityCrew;
	    public EntityCastAndCrew() {
	        
	    }
	    public List<EntityCast> getEntityCast() {
	        return entityCast;
	    }
	    public void setEntityCast(List<EntityCast> entityCast) {
	        this.entityCast = entityCast;
	    }
	    public List<EntityCrew> getEntityCrew() {
	        return entityCrew;
	    }
	    public void setEntityCrew(List<EntityCrew> entityCrew) {
	        this.entityCrew = entityCrew;
	    }
}
