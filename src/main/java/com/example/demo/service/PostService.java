package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;
    public List<Post> listAllPosts(){return posts;}

    public PostService(){
        initPosts();
    }
    private void initPosts(){
        posts=new ArrayList<Post>(Arrays.asList(new Post((long)0,"Продается телевизор, купили новый. Торг уместен", new Date(2007)),
                new Post((long)1,"Стерилизация - единственное гуманное и эффективное решение проблемы бездомных животных.", new Date(126,1,5)),
                new Post((long)2,"Линька – естественный процесс обновления шерстного покрова, характерный для большинства животных.", new Date(116,4,5))));
    }
    public void create(String text) {
        posts.add(new Post((long)posts.size(),text, new Date()));
    }
}
