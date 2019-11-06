package Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id","name","email","description"})
public class RetrieveResponse {
	
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
		return "RetrieveResponse [id=" + id + ", name=" + name + ", email=" + email + ", description=" + description
				+ "]";
	}
	
	
}
