package com.yc.springcloud_detail.security.dao;
import com.yc.springcloud_detail.miscroserivceapi.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends MisBaseMapper<Book>{
}