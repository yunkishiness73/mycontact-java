package com.kietnguyen.mycontact.service;

import java.util.List;

import com.kietnguyen.mycontact.model.Contact;

public interface ContactService {
	Iterable<Contact> findAll();

    List<Contact> search(String term);

    Contact findOne(Integer id);

    void save(Contact contact);

    void delete(Integer id);
}
