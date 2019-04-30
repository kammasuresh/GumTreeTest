package com.gumtree.address.book.userStoryValidation;

import org.junit.Before;
import org.junit.Test;

public class AddressBookUserStoryValidationTest {
	 private AddressBookUserStoryValidation addressBookUserStoryValidation;

	    @Before
	    public void setUp() throws Exception {
	        this.addressBookUserStoryValidation = new AddressBookUserStoryValidation();
	    }
	    /*Your application needs to read the attached AddressBook file and answer the following questions:
     How many males are in the address book?
     Who is the oldest person in the address book?
     How many days older is Bill than Paul?*/
	    //
	    @Test
	    public void testGetHowManyMaleGender() throws Exception {
	       // How many males are in the address book?

	        Gender gender = Gender.MALE;
	        assertEquals(3, addressBookUserStoryValidation.getHowManyGender(gender.getValue()));
	        assertEquals(0, addressBookUserStoryValidation.getHowManyGender("boo"));
	    }
}
