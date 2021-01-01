package com.jedis.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jedis.demo.pojo.User;

@SpringBootTest
class RedisJedisDemoApplicationTests {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@Test
	void contextLoads() {
		
		RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
		String pong = connection.ping();
		System.out.println(pong);
		
		//	redisTemplate.opsForValue()
		//	redisTemplate.opsForHash()
		//	redisTemplate.opsForList()
		//	redisTemplate.opsForSet()
		//	redisTemplate.opsForZSet()
		//	redisTemplate.opsForGeo()
		redisTemplate.opsForValue().set("k5", "v5");
		System.out.println(redisTemplate.opsForValue().get("k5"));
		
		redisTemplate.opsForValue().set("k6", "李国栋");
		//	127.0.0.1:6379> keys *
		//	1) "\xac\xed\x00\x05t\x00\x02k6"
		//没有配置序列化，导致的乱码
	}
	
	@Test
	void TEST1() throws JsonProcessingException {
		//一般使用JSON传递对象
		User user = new User("alice", 20);
		String jsonUser = new ObjectMapper().writeValueAsString(user);
		redisTemplate.opsForValue().set("user", user);
		System.out.println(redisTemplate.opsForValue().get("user"));
		//	127.0.0.1:6379> keys *
		//	1) "k6"
		//	127.0.0.1:6379>
	}

}
