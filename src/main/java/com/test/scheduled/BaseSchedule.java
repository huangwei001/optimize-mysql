package com.test.scheduled;

import com.test.entity.User;
import com.test.service.UserService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.UUID;

@Component
public class BaseSchedule {

    @Autowired
    UserService userService;

//    @Scheduled(cron = "0 */1 * * * ?")
    public void addUser() {
        for (int i = 0; i < 1000; i++) {
            DecimalFormat bigDecimal = new DecimalFormat("#");
            User user = new User();
            user.setId(UUID.randomUUID().toString());
            user.setAddress("中央门街道" + Math.random() + "号");
            user.setName("测试" + Math.random());
            user.setOld(Integer.parseInt(bigDecimal.format(Math.random())));
            if (Integer.parseInt(bigDecimal.format(Math.random())) / 2 == 0) {
                user.setSex("男");
            }else {
                user.setSex("女");
            }
            user.setIdCard(bigDecimal.format(Math.random()));
            user.setTel(bigDecimal.format(Math.random()));
            userService.saveUser(user);
        }

    }

}
