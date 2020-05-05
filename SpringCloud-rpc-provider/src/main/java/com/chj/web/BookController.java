package com.chj.web;

import com.chj.model.Book;
import com.chj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/4 20:50
 * @params :
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    /** 方法描述 
    * @Description: 生产者查询
    * @Param: []
    * @return: java.util.List<com.chj.model.Book>
    * @Author: chj
    * @Date: 2020/5/4
    */
    @GetMapping("/ProBookAll")
    public List<Book> selectAll(){
        return bookService.selectAll();
    }

}
