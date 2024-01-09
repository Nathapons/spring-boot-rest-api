package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.model.Contact;

public interface ContactService {

    List<Contact> getContacts();

    Contact getContactById(String id);

    void saveContact(Contact contact);

    void updateContact(String id, Contact contact);
    
    void deleteContact(String id);
}