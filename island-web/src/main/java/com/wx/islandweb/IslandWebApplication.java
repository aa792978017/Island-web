package com.wx.islandweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wx.islandweb.dao")
public class IslandWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(IslandWebApplication.class, args);
	}
}
