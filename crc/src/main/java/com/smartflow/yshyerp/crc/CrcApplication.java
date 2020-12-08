package com.smartflow.yshyerp.crc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author haita
 */
@MapperScan("com.smartflow.yshyerp.crc.mappper")
@SpringBootApplication
public class CrcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrcApplication.class, args);
    }

}
