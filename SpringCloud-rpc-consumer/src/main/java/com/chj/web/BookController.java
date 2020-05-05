package com.chj.web;

import com.chj.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/4 21:01
 * @params :
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    /** 方法描述 
    * @Description: 消费者查询所有书籍
    * @Param: []
    * @return: java.util.List<com.chj.model.Book>
    * @Author: chj
    * @Date: 2020/5/4
    */
    @GetMapping("/ConBookAll")
    public List<Book> selectAll(){
        return restTemplate.getForObject("http://localhost:8080/ProBookAll",List.class);
    }
}
