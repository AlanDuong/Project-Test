package Service;

import Model.RetrieveRequest;
import Model.RetrieveResponse;

public interface Retrieve {

	public RetrieveResponse retrieve(RetrieveRequest req);
	
	
}
