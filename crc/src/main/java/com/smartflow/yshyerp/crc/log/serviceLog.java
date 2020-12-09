package com.smartflow.yshyerp.crc.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import springfox.documentation.service.ApiListing;

/**
 * @author ：tao
 * @date ：Created in 2020/12/8 17:25
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Component
public class serviceLog implements Runnable {
    private final
    MongoTemplate mongoTemplate;

    @Value("${mongodb.crcCollection}")
    private String mongdbCrcCollection;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    @Autowired
    public serviceLog(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run() {
        if (message!=null) {
            mongoTemplate.insert(message,mongdbCrcCollection);
        }
    }


}
