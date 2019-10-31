package com.kietnguyen.mycontact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kietnguyen.mycontact.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
	List<Contact> findByNameContaining(String term);
	
	Contact findContactById(Integer id);
	
}
