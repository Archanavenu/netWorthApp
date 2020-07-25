package com.archana.demospringboot16thdec.controller;

import com.archana.demospringboot16thdec.model.BalanceSheet;
import com.archana.demospringboot16thdec.service.BalanceSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BalanceSheetController {
    @Autowired
    private final BalanceSheetService balanceSheetService;

    public  BalanceSheetController(BalanceSheetService balanceSheetService){
        this.balanceSheetService=balanceSheetService;
    }


    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Spring Boot, the time at the server is now " + new Date() + "\n";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public BalanceSheet createBalanceSheet(@RequestBody BalanceSheet balanceSheet){
        return balanceSheetService.saveBalanceSheet(balanceSheet);
    }

    @RequestMapping(value="/getBalanceSheet/{id}", method = RequestMethod.GET,consumes = "application/json", produces = "application/json")
    public BalanceSheet getBalanceSheetById(@PathVariable("id") int id){
        return balanceSheetService.getBalanceSheetById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/netWorth", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public Long calculateNetWorth(@RequestBody ArrayList<BalanceSheet> balanceSheets)throws Exception{
        return balanceSheetService.calculateNetWorth(balanceSheets);

    }

}
