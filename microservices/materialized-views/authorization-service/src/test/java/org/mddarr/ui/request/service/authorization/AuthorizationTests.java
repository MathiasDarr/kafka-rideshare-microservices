package org.mddarr.ui.request.service.authorization;


import com.google.gson.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.ui.request.service.security.ApplicationUserDetails;
import org.mddarr.ui.request.service.ContainersTestingServiceApplication;

import org.mddarr.ui.request.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = ContainersTestingServiceApplication.class)
public class AuthorizationTests {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;


    @Autowired
    ApplicationUserDetails applicationUserDetails;

    @MockBean
    UserService userService;

    @BeforeEach
    public void setUp() {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void should_authenticate() throws Exception {

        MvcResult result = mockMvc.perform(post("/api/authenticate")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ \"username\": \"cdick@gmail.com\", \"password\": \"password\"}")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
        MockHttpServletResponse mockHttpServletResponse =  result.getResponse();

        String jsonResponse = mockHttpServletResponse.getContentAsString();

        JsonObject jobj = new Gson().fromJson(jsonResponse, JsonObject.class);
        String token = jobj.get("jwt").toString();
        System.out.println(token);

//        JsonElement jelement = new JsonParser().parse(jsonResponse);
//
//        System.out.println(jelement);
//
//        System.out.println(jelement.get("jwt"));
//        JsonObject jobject = jelement.getAsJsonObject();
//        jobject = jobject.getAsJsonObject("jwt");
//        JsonArray jarray = jobject.getAsJsonArray("translations");
//        jobject = jarray.get(0).getAsJsonObject();
//        String parsed_json = jobject.get("translatedText").getAsString();


//        System.out.println(mockHttpServletResponse.getContentAsString());
//
//        System.out.println("THE PARSED JSON IS " + jobject.getAsString());

    }

}