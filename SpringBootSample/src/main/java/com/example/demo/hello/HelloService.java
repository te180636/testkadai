package com.example.demo.hello;

import java. util. Map; import org. springframework. beans. factory. annotation. Autowired;
import org. springframework. stereotype. Service;

@Servise
public class HelloService {	
	@Autowired
	private HelloRepository repository;
	
	public Employee getEmployee(String id) {
		//検索
		Map<String,Object> map = repository.findById(id);
		
		//mapから値を取得
		String employeed = (String) map.get("id");
		String name = (String) map.get("name");
		int age = ()
		
	}
}
