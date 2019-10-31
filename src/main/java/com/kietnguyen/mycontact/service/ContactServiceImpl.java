package com.kietnguyen.mycontact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kietnguyen.mycontact.model.Contact;
import com.kietnguyen.mycontact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	 	@Autowired
	    private ContactRepository contactRepository;

	    @Override
	    public Iterable<Contact> findAll() {
	        return contactRepository.findAll();
	    }

	    @Override
	    public List<Contact> search(String term) {
	        return contactRepository.findByNameContaining(term);
	    }

	    @Override
	    public Contact findOne(Integer id) {
	        return contactRepository.findContactById(id);
	    }

	    @Override
	    public void save(Contact contact) {
	        contactRepository.save(contact);
	    }

	    @Override
	    public void delete(Integer id) {
	    	Contact contact = contactRepository.findContactById(id);
	    	
	    	if (contact != null) {
	    		 contactRepository.delete(contact);
	    	}
	    }
}
