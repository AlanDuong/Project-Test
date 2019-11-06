package Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Customer;
import Model.RetrieveRequest;
import Model.RetrieveResponse;
import ServiceImpl.CustomerServiceImpl;
import ServiceImpl.RetrieveImpl;

@RestController
@RequestMapping(path = "/users")
public class Controller {
	
	@Autowired
	private RetrieveImpl retrieveService;
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RetrieveResponse> retrieve (@RequestBody RetrieveRequest req) {
		RetrieveResponse resp = retrieveService.retrieve(req);
		return ResponseEntity.ok().body(resp);
	}
	
	@GetMapping
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

}
