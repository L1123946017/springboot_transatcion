package com.ljh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author Jiahui Li
 * @DATE 2019/9/25 12:16
 */
@Data
@Component
@ConfigurationProperties(prefix = "mysql.datasource.test2")
@PropertySource(value = {"classpath:application.yml"})
public class DBConfig2 {

	private String url;
	// 比如这个url在properties中是这样子的mysql.datasource.test1.username = root
	private String username;
	private String password;
	private int minPoolSize;
	private int maxPoolSize;
	private int maxLifetime;
	private int borrowConnectionTimeout;
	private int loginTimeout;
	private int maintenanceInterval;
	private int maxIdleTime;
	private String testQuery;
}
