package com.timothy.es.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhengxun
 * @version 2018-12-28
 */
public interface PersonRepository extends ElasticsearchRepository<Person, String> {

}
