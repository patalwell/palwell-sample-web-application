package com.palwell.Controller;

import com.palwell.Model.SampleUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Returns Index View
 */

@Controller
public class DataTablesController {

    @GetMapping("/")
    public String index(Model model) {
            List<SampleUser> userList = new ArrayList<SampleUser>();

            //Generate 10 Users
            for (int i = 0; i < 50; i++) {
                SampleUser user = new SampleUser(String.valueOf(i + 1),
                        String.format("user%d@example.com", i + 1));
                userList.add(user);
            }
//            System.out.println(userList);
            model.addAttribute("userList", userList);

            return "index";
        }

}

