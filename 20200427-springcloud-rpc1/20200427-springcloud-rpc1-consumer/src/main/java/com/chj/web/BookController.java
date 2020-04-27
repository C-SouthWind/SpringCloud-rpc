package com.chj.web;

import com.chj.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/4/27 20:16
 * @params :
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     *消费者查询
     * @return
     */
    @GetMapping("/ConBook")
    public List<Book> selectAll(){
        return restTemplate.getForObject("http://localhost:8080/ProBook",List.class);
    }
}
