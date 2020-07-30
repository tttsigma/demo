package com.ttt.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
public class UserControllerTest extends DemoApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addUser() throws Exception {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");

        /*JSONObject request = new JSONObject();
        request.put("id", 0);
        request.put("name", "testing11");
        request.put("password", "123");
        request.put("role", "123");*/

        String json = "{\n" +
                "  \"id\": 0,\n" +
                "  \"name\": \"testing\",\n" +
                "  \"password\": \"123\",\n" +
                "  \"role\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"admin\",\n" +
                "    \"desc\": \"经理\"\n" +
                "  }\n" +
                "}";
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/api/user")
                .headers(httpHeaders)
                .content(json);
        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}
