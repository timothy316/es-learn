package com.timothy.es.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author zhengxun
 * @version 2019-01-09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-elasticsearch.xml")
public class PersonRepositoryTest {
    @Resource
    private PersonRepository personRepository;
    @Test
    public void testSave(){
        Person person = new Person();
        person.setId("5");
        person.setName("你好");
        person.setTestName("你是谁");
        personRepository.save(person);
    }

    @Test
    public void testGet(){
        Person person = personRepository.findById("3").get();
    }

}