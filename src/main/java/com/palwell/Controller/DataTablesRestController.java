package com.palwell.Controller;

import java.util.ArrayList;
import java.util.List;
import com.palwell.Model.SampleUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

/*
To Do:

 */

@RestController
public class DataTablesRestController {

    private Gson gson = new Gson(); // Or use new GsonBuilder().create();

    @RequestMapping("/getUserList")
    public List<String> getUserList() {
        List<String> userJsonArray = new ArrayList<>();

        //Generate 10 Users
        for (int i=0; i < 10; i++) {
            //create a sample user
            SampleUser user = new SampleUser(String.valueOf(i + 1),
                    String.format("user%d@example.com", i + 1));

            //convert user to JSON object
            String jsonUser = gson.toJson(user);
            userJsonArray.add(jsonUser);
        }

        return userJsonArray;
    }
}
