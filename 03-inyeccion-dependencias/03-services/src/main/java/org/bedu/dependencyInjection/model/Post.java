package org.bedu.dependencyInjection.model;

public class Post {
  private String content;
  private long userId;

  public Post(String content, long userId) {
    this.content = content;
    this.userId = userId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
}
