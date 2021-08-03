package com.imooc.es.dao;

import com.imooc.es.pojo.Stu;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface StuRepository  extends ElasticsearchRepository<Stu,Long> {
}
