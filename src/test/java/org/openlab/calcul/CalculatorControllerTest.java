package org.openlab.calcul;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdd() throws Exception {
        mockMvc.perform(get("/calculator/add?a=5&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("8"));
    }

    @Test
    public void testSubtract() throws Exception {
        mockMvc.perform(get("/calculator/subtract?a=5&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("2"));
    }

    @Test
    public void testMultiply() throws Exception {
        mockMvc.perform(get("/calculator/multiply?a=5&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("15"));
    }

    @Test
    public void testDivide() throws Exception {
        mockMvc.perform(get("/calculator/divide?a=6&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("2.0"));
    }

}
