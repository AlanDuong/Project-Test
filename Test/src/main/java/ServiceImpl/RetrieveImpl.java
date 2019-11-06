package ServiceImpl;

import org.springframework.stereotype.Component;

import Model.RetrieveRequest;
import Model.RetrieveResponse;
import Service.Retrieve;

@Component
public class RetrieveImpl implements Retrieve {

	public RetrieveResponse retrieve(RetrieveRequest req) {

		RetrieveResponse resp = new RetrieveResponse();
		
		resp.id = req.id;
		resp.name = req.name;
		resp.email = req.email;
		resp.description = req.description;

		return resp;
	}

}
