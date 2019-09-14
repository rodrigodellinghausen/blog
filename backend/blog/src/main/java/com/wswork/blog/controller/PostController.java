package com.wswork.blog.controller;

import com.wswork.blog.dao.PostDao;
import com.wswork.blog.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class PostController {

    @Autowired
    private PostDao dao;

    @GetMapping ("/post") //pega todos os posts.
    public List<Post> listaTodos(){
        return dao.findAll();
    }

    @PostMapping ("/post")
    public Post salvar(@RequestBody Post post){
        post.setDataCriacao(new Date());
        return dao.save(post);
    }
}
