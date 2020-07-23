package com.archana.demospringboot16thdec;

import com.archana.demospringboot16thdec.model.BalanceSheet;
import com.archana.demospringboot16thdec.model.User;
import com.archana.demospringboot16thdec.repository.BalanceSheetRepo;
import com.archana.demospringboot16thdec.repository.UserRepository;
import com.archana.demospringboot16thdec.service.BalanceSheetService;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;

public class BalanceSheetServiceTest {
    static BalanceSheet balanceSheet;
    @Autowired
    BalanceSheetService balanceSheetService;
    @MockBean
    UserRepository userRepository;
    @MockBean
    BalanceSheetRepo balanceSheetRepo;

    @BeforeClass
    public static void setUp(){
        balanceSheet= new BalanceSheet();
        System.out.println("Setup done");
    }
    @Test
    public void testNetWorthCalculator() throws Exception {
        ArrayList<BalanceSheet> balanceSheetList= new ArrayList<>();
        balanceSheetList.add(new BalanceSheet("ASSET",10000,"House"));
        balanceSheetList.add(new BalanceSheet("LIABILITY",2000,"House"));
        balanceSheetList.add(new BalanceSheet("ASSET",6000,"House"));
        balanceSheetList.add(new BalanceSheet("LIABILITY",3000,"House"));
        long networth= balanceSheetService.calculateNetWorth(balanceSheetList);
        System.out.println("Networth:"+ networth);
        Assert.assertEquals(11000,networth);
    }


    @AfterClass
    public static void destroy() {
        System.out.println("Destroyed");
    }
}
