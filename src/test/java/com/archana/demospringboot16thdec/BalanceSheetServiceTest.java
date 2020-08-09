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
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class BalanceSheetServiceTest {

    @Autowired
    UserRepository userRepository;
    @Autowired
    BalanceSheetRepo balanceSheetRepo;

    @BeforeClass
    public static void setUp() {
        System.out.println("Setup done");
    }

    @AfterClass
    public static void destroy() {
        System.out.println("Destroyed");
    }

    @Test
    public void testNetWorthCalculator() throws Exception {
        User user = new User();
        ArrayList<BalanceSheet> balanceSheetList = new ArrayList<>();
        balanceSheetList.add(new BalanceSheet("ASSET", 10000));
        balanceSheetList.add(new BalanceSheet("LIABILITY", 2000));
        balanceSheetList.add(new BalanceSheet("ASSET", 6000));
        balanceSheetList.add(new BalanceSheet("LIABILITY", 3000));
        BalanceSheetService balanceSheetService = new BalanceSheetService(balanceSheetRepo, userRepository);
        long networth = balanceSheetService.calculateNetWorth(balanceSheetList);
        System.out.println("Networth:" + networth);
        Assert.assertEquals(11000, networth);
    }

    @Test(expected = Exception.class)
    public void testNetWorthCalculatorException() throws Exception {
        User user = new User();
        ArrayList<BalanceSheet> balanceSheetList = new ArrayList<>();
        balanceSheetList.add(new BalanceSheet("Buiding", 10000));
        balanceSheetList.add(new BalanceSheet("LIABILITY", 2000));
        balanceSheetList.add(new BalanceSheet("Home", 6000));
        balanceSheetList.add(new BalanceSheet("Land", 3000));
        BalanceSheetService balanceSheetService = new BalanceSheetService(balanceSheetRepo, userRepository);
        long networth = balanceSheetService.calculateNetWorth(balanceSheetList);

    }
}
