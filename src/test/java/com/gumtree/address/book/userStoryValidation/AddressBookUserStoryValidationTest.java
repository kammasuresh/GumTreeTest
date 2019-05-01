package com.gumtree.address.book.userStoryValidation;

import static org.junit.Assert.*;

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
	    //	       // How many Females are in the address book?

	    @Test
	    public void testGetHowManyFemaleGender() throws Exception {

	        Gender gender = Gender.FEMALE;
	        assertEquals(2, addressBookUserStoryValidation.getHowManyGender(gender.getValue()));
	        assertEquals(0, addressBookUserStoryValidation.getHowManyGender("boo"));
	    }
	    // Who is the oldest person in the address book?

	    @Test
	    public void testGetTheOldestPersonInAddressBook() throws Exception {
	        assertEquals("Wes Jackson", addressBookUserStoryValidation.getTheOldestPersonInAddressBook());
	    }
	    // How many days older is Bill than Paul?*/

	    @Test
	    public void testGetDayDiffBetweenContacts() throws Exception {
	        assertEquals(2862, addressBookUserStoryValidation.getDayDiffBetweenContacts("Bill McKnight", "Paul Robinson"));
	    }
         //      How many days older is Bill than Paul?*/Null pointer Exception
	    @Test(expected = NullPointerException.class)
	    public void testGetDayDiffBetweenContactsWithException() throws Exception {
	        assertEquals(0, addressBookUserStoryValidation.getDayDiffBetweenContacts("Foo", "Bar"));
	    }

}
