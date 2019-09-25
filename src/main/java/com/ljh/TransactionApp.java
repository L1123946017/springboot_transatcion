package com.ljh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Jiahui Li
 * @DATE 2019/9/25 11:37
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ljh.mapper")
public class TransactionApp {
	public static void main(String[] args) {
		SpringApplication.run(TransactionApp.class,args);
	}
}
