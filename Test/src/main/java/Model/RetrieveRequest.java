package Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id","name","email","description"})
public class RetrieveRequest {
	
	@JsonProperty
	public int id;
	
	@JsonProperty
	public String name;
	
	@JsonProperty
	public String email;
	
	@JsonProperty
	public String description;
	
	
	@Override
	public String toString() {
		return "RetrieveRequest [id=" + id + ", name=" + name + ", email=" + email + ", description=" + description
				+ "]";
	}
	
	

}
