package movies.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


public class EntitysUsers {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	
	@NotBlank(message = "Name cant be null")
	private String username;
	
	@NotBlank(message = "Password can't be null")
	private String password;
	
	@NotBlank(message = "Role can't be null")
	private String role;
	
	@NotBlank(message = "Enable can't be null")
	private boolean enable;
	
	
	

	public EntitysUsers() {
		super();
	}




	public EntitysUsers(Integer userid, @NotBlank(message = "Name can't be null") String username,
			@NotBlank(message = "Password can't be null") String password,
			@NotBlank(message = "Role can't be null") String role,
			@NotBlank(message = "Enable can't be null") boolean enable) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.role = role;
		this.enable = enable;
	}




	public Integer getUserid() {
		return userid;
	}




	public void setUserid(Integer userid) {
		this.userid = userid;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public boolean isEnable() {
		return enable;
	}




	public void setEnable(boolean enable) {
		this.enable = enable;
	}




	@Override
	public String toString() {
		return "EntitysUsers [userid=" + userid + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", enable=" + enable + "]";
	}
	
	
	
	
}
