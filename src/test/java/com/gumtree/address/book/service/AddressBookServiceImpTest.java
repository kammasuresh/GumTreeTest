package com.gumtree.address.book.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gumtree.address.book.model.AddressBook;

public class AddressBookServiceImpTest {
	private AddressBookServiceImpl addressBookService;

    @Before
    public void setUp() throws Exception {
        this.addressBookService = new AddressBookServiceImpl();
    }
    @Test
    public void testGetAddressBookList() throws Exception {
        List<AddressBook> addressBooks = addressBookService.getAddressBookList();
        assertEquals(5, addressBooks.size());
    }
	
}
