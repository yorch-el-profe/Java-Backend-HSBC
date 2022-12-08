package org.bedu.dependencyInjection.controller;

import java.util.List;

import org.bedu.dependencyInjection.model.Post;
import org.bedu.dependencyInjection.service.IPostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

  private IPostService postService;

  public PostController(IPostService postService) {
    this.postService = postService;
  }

  @GetMapping()
  public List<Post> getAll() {
    return postService.getAll();
  }
}
