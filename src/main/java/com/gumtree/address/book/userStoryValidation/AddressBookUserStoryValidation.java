package com.gumtree.address.book.userStoryValidation;

import java.util.List;

import com.gumtree.address.book.model.AddressBook;
import com.gumtree.address.book.service.AddressBookServiceImpl;

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
	

}
