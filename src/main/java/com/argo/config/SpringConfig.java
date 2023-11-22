package com.argo.config;


import com.argo.config.JDBCConfig;
import com.argo.config.MybatisConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.argo.service")
@PropertySource("jdbc.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
public class SpringConfig {
}
