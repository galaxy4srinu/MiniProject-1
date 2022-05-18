package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Contact;
import in.ashokit.service.ContactService;

@RestController
public class ContactRestController {
	@Autowired
	private ContactService contactservice;

	@PostMapping("/contact")
	public ResponseEntity<String> createContact(@RequestBody Contact contact) {
		contactservice.upsert(contact);
		return new ResponseEntity<>("Contact successfully created ", HttpStatus.CREATED);
	}
	
	@GetMapping("/contact/{cid}")
	public ResponseEntity<Contact> getContactById(@PathVariable("cid") int cid){
		Contact contact = contactservice.getContact(cid);
		return new ResponseEntity<Contact>(contact,HttpStatus.OK);
	}
	
	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAllContacts(){
		List<Contact> contacts = contactservice.getAllContacts();
		return new ResponseEntity<List<Contact>>(contacts,HttpStatus.OK);
	}
	
	@DeleteMapping("/contact/{cid}")
	public ResponseEntity<String> deleteContact(@PathVariable("cid") int cid){
		contactservice.deleteContact(cid);
		return new ResponseEntity<String>("Contact successfully deleted",HttpStatus.OK);
	}
	

}
