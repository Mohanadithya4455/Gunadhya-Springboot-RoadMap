package com.example.securityproject.controllers;


import com.example.securityproject.models.Book;
import com.example.securityproject.models.User;
import com.example.securityproject.service.BookServiceImpl;
import com.example.securityproject.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/book")
public class OwnerController {
  @Autowired
    BookServiceImpl bookService;
    @Autowired
    UserServiceImpl userService;
    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book, @RequestHeader("Authorization") String jwt) throws Exception {
     User user = userService.getUserByJwt(jwt);
     Book book1 = bookService.createBook(book);
     return book1;
    }
}
