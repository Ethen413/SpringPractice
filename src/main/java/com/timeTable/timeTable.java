package com.timeTable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 * http://localhost:8091/swagger-ui/index.html
 * 查看api文档
 */
@SpringBootApplication
public class timeTable
{
    public static void main( String[] args )
    {
        SpringApplication.run(timeTable.class,args);
    }
}
