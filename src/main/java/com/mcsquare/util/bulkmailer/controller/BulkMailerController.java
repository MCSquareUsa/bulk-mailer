package com.mcsquare.util.bulkmailer.controller;

import com.mcsquare.util.bulkmailer.processor.BulkMailProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BulkMailerController {

    @Autowired
    private BulkMailProcessor bulkMailProcessor;

    @GetMapping(value = "/sendmails")
    public void sendEmails() {

        bulkMailProcessor.processor();
    }
}
