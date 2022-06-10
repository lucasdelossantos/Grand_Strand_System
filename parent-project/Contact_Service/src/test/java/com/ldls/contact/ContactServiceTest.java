/*
 * Copyright (c) 2022 Lucas de los Santos
 */

package com.ldls.contact;

import org.junit.jupiter.api.Test;

import static com.ldls.contact.ContactService.uuid;

public class ContactServiceTest {

    @Test
    public void createModifyAndDeleteUser(){
        Contact c1 = new Contact(uuid, "Jane", "Doe","5557591023","123 Cottage Street");
        ContactService contactService = new ContactService();
        System.out.println(contactService.addContact(c1));
        System.out.print(contactService.updateContact(uuid,"Jane","Smith","5555882345","4019 Highway 88"));
        System.out.print(contactService.deleteContact(uuid));

    }
}
