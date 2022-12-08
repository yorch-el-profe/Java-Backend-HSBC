package org.bedu.dependencyInjection.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.bedu.dependencyInjection.model.Post;
import org.bedu.dependencyInjection.service.IPostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements IPostService {

  private List<Post> posts;

  public PostServiceImpl() {
    posts = new LinkedList<>();
    posts.add(new Post("Hello World", 1));
    posts.add(new Post("Esto es una prueba", 2));
  }

  public List<Post> getAll() {
    return posts;
  }
}
