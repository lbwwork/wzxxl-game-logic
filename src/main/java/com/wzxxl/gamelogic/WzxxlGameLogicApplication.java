package com.wzxxl.gamelogic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzxxl.gamelogic.mapper")
public class WzxxlGameLogicApplication {

    public static void main(String[] args) {
        SpringApplication.run(WzxxlGameLogicApplication.class, args);
    }

}
