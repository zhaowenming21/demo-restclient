package com.example.demorestclient;

import org.springframework.web.client.RestTemplate;

public class RestTemplateMain {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Person person = restTemplate.getForObject("http://localhost:8080/person/赵文明", Person.class);
        System.out.println(person.getName()+"------------"+person.getAge());
    }
}
