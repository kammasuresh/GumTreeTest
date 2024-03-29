package com.gumtree.address.book.userStoryValidation;

import java.util.Date;
import java.util.List;

import com.gumtree.address.book.model.AddressBook;
import com.gumtree.address.book.service.AddressBookServiceImpl;
import com.gumtree.address.book.utils.Helper;

public class AddressBookUserStoryValidation  {
	 
	AddressBookServiceImpl addressBookService=new AddressBookServiceImpl();
	    //How many males are in the address book?  business logic implemented
	public int getHowManyGender(String gender) throws Exception {
	        List<AddressBook> addressBooks = addressBookService.getAddressBookList();
	        int count = 0;
	        for (AddressBook addressBook : addressBooks) {
	            if (addressBook.getGender().trim().equals(gender)) {
	                count = count + 1;
	            }
	        }
	        return count;
	    }
	
       //Who is the oldest person in the address book?
	
	 public String getTheOldestPersonInAddressBook() throws Exception {
	        String name = null;
	        List<AddressBook> addressBooks = addressBookService.getAddressBookList();
	        Date maxDate = addressBooks.stream().map(u -> u.getBirthDate()).min(Date::compareTo).get();

	        for (AddressBook addressbook : addressBooks) {
	            if (addressbook.getBirthDate().equals(maxDate)) {
	                name = addressbook.getName();
	                break;
	            }
	        }
	        return name;
	    }
	 //Who is the oldest person in the address book?
	 public long getDayDiffBetweenContacts(String contactA, String contactB) throws Exception {
	        List<AddressBook> addressBooks = addressBookService.getAddressBookList();
	        AddressBook a = new AddressBook();
	        AddressBook b = new AddressBook();

	        addressBooks.forEach(item -> {
	            if (contactA.equals(item.getName())) {
	                a.setBirthDate(item.getBirthDate());
	            }
	        });
	        addressBooks.forEach(item -> {
	            if (contactB.equals(item.getName())) {
	                b.setBirthDate(item.getBirthDate());
	            }
	        });

	        return Helper.getTimeDiffFromTwoDate(a.getBirthDate(), b.getBirthDate());
	    }
	}

