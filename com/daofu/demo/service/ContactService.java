package com.daofu.demo.service;

import com.daofu.demo.entity.ContactMessage;
import com.daofu.demo.repo.ContactMessageRepo;

@Service
public class ContactService {

    @Autowired
    private ContactMessageRepo contactMessageRepo;

    @Autowired
    private EmailService emailService;

    @Transactional
    public void submitContactForm(ContactMessage contactMessage){

        // save the contact message
        contactMessageRepo.save(contactMessage);

        // send mail
        emailService.sendMessage("","","xxxxx");
    }
}
