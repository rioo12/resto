package com.apollo.resto.controller;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apollo.resto.repository.bookingRepository;
import com.apollo.resto.repository.custRepository;
import com.apollo.resto.repository.tablepaxRepository;
import com.apollo.resto.service.restoService;


@RequestMapping("/api")
@RestController

public class cont {

    @Autowired
    custRepository cusRepo;
    @Autowired
    tablepaxRepository tbpaxRepo;
    @Autowired
    bookingRepository bookingRepo;
    @Autowired
    restoService resto;
    
   // @RequestMapping("/addBooking")
    //@ResponseBody
   //public String addBooking(customer customerData, tablepax tablepaxData, bookingrecord bookingData){
    //cusRepo.save(customerData);
    //tbpaxRepo.save(tablepaxData);
    //bookingRepo.save(bookingData);
    //return "Success";
   //}

   @Async("asyncExecutor")
   @PostMapping("/addBooking")
   public CompletableFuture<String> getimportpreassesment(@RequestBody Map<String, String> params){
       
    return CompletableFuture.completedFuture(resto.addNewBooking(params));
       
   }
}


