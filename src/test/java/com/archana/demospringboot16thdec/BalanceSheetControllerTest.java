package com.archana.demospringboot16thdec;

import com.archana.demospringboot16thdec.controller.BalanceSheetController;
import com.archana.demospringboot16thdec.model.BalanceSheet;
import com.archana.demospringboot16thdec.model.User;
import com.archana.demospringboot16thdec.service.BalanceSheetService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.Arrays;

import static com.archana.demospringboot16thdec.service.BalanceSheetService.ASSET;
import static com.archana.demospringboot16thdec.service.BalanceSheetService.LIABILITY;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest
public class BalanceSheetControllerTest {

    @Mock
    BalanceSheetService balanceSheetService;

    @InjectMocks
    BalanceSheetController balanceSheetController;

    private MockMvc mockMvc;

    public BalanceSheetControllerTest(){
        balanceSheetService= Mockito.mock(BalanceSheetService.class);
        balanceSheetController= new BalanceSheetController(balanceSheetService);
    }

    @Before
    public void init(){
       this.mockMvc= MockMvcBuilders.standaloneSetup(balanceSheetController).build();
    }

    @Test
    public void calculateNetWorthTest() throws Exception{

        User user = new User();
        ArrayList<BalanceSheet> balanceSheetList = new ArrayList<>();
        balanceSheetList.add(new BalanceSheet("ASSET", 10000));
        balanceSheetList.add(new BalanceSheet("LIABILITY", 2000));
        balanceSheetList.add(new BalanceSheet("ASSET", 6000));
        balanceSheetList.add(new BalanceSheet("LIABILITY", 3000));
        Mockito.when(balanceSheetService.calculateNetWorth(balanceSheetList)).thenReturn(11000L);
      //mockMvc.perform(MockMvcRequestBuilders.post("/netWorth").
    }
}
