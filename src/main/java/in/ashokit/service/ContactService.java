package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Contact;

public interface ContactService {

	public String upsert(Contact contact);

	public Contact getContact(int cid);

	public List<Contact> getAllContacts();

	public String deleteContact(int cid);

}
