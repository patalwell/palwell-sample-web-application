package com.palwell.Controller;
import java.util.ArrayList;
import java.util.List;

import com.palwell.Model.SampleUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataTablesRestController {

    @RequestMapping("/getUserList")
    public List<SampleUser> getUserList() {
        List<SampleUser> userList = new ArrayList<>();

        //Generate 10 Users
        for (int i=0; i < 10; i++) {
            SampleUser user = new SampleUser(String.valueOf(i + 1),
                    String.format("user%d@example.com", i + 1));
            userList.add(user);
        }
        return userList;
    }
}
