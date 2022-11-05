package com.addressbook;

import java.util.ArrayList;

/**
 * 
 * @author Dipali
 *
 */

public class AddressBook {
	 ArrayList<Contact> contacts = new ArrayList<>();

	    public void createContact(String firstName, String lastName, String street, String city, String state, int zip, long phoneNo, String email){
	        Contact contact = new Contact(firstName,lastName,street,city,state,zip,phoneNo,email);
	        contacts.add(contact);
	    }

	}
	
