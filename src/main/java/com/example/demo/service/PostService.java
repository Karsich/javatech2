package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        Post[] posts = {new Post("Продается телевизор, купили новый. Торг уместен", new Date(2007)),
                        new Post("Стерилизация - единственное гуманное и эффективное решение проблемы бездомных животных.", new Date(126,1,5)),
                        new Post("Линька – естественный процесс обновления шерстного покрова, характерный для большинства животных.", new Date(116,4,5))};

        return new ArrayList<Post>(Arrays.asList(posts));
    }
}
