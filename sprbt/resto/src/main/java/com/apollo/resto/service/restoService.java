package com.apollo.resto.service;
import com.apollo.resto.model.bookingrecord;
import com.apollo.resto.model.customer;
import com.apollo.resto.model.tablepax;
import com.apollo.resto.repository.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class restoService {

  
    @Autowired
    private custRepository cusRepo;
    @Autowired
    private tablepaxRepository tbpaxRepo;
    @Autowired
    private bookingRepository bookingRepo;


        public String addNewBooking(Map<String, String> params) {

            new HashMap<String, String>();
            
            String cusName = params.get("cusName");
            String cusEmail = params.get("cusEmail");
            String tblsName = params.get("tblsName");
            String bkngDate = params.get("bkngDate");
            String bkngTime = params.get("bkngTime");

            customer custom = new customer();
            tablepax tablePax =  new tablepax();
            bookingrecord bookingRecord = new bookingrecord();

            try {
                if(cusName.equals("") || cusName == null){
                    return "Error";
                }
                else{
                    custom.setCusName(cusName);
                }
                if(cusEmail.equals("") || cusEmail == null){
                    return "Error";
                }
                else{
                    custom.setCusEmail(cusEmail);
                }
                if(tblsName.equals("") || tblsName == null){
                    return "Error";
                }
                else{
                    tablePax.setTblsName(tblsName);  
                }
                if(bkngDate.equals("") || bkngDate == null){
                    return "Error";
                }
                else{
                  //LocalDate bkngDate1 = LocalDate.parse(bkngDate);
                 // bookingRecord.setBkngDate(bkngDate1);
                 
                new SimpleDateFormat("yyyy-MM-dd").parse(bkngDate); 
                
                 
                }
                if(bkngTime.equals("") || bkngTime == null){
                    return "Error";
                }
                else{
                    //LocalDateTime bkngTime1 = LocalDateTime.parse(bkngTime);
                    //bookingRecord.setBkngTime(bkngTime1);
                   // LocalDateTime bkngTime1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS").parse(bkngTime);
                   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                   LocalDateTime.parse(bkngTime, formatter);
                }

                cusRepo.save(custom);
                tbpaxRepo.save(tablePax);
                bookingRepo.save(bookingRecord);

            } 
            catch (Exception e) {
                System.out.print(e.getMessage());
                return "" + e.getMessage();
                
            }

            return "success";

        }
    }