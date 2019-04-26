package com.example.demo.post;

public class Post{
    private long id;
    private String title;
    private String url;
    private String content;

    public Post(long id, String title, String url, String content){
        this.id =id;
        this.title=title;
        this.url=url;
        this.content=content;
    }

    public long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getUrl(){
        return url;
    }

    public String getContent(){
        return content;
    }

    public void setId(long id){
        this.id = id;
    }
    public void setTitle(String title){
    this.title =title;
    }

    public void setUrl(String url){
        this.url =url;
    }

    public void setContent(String content){
        this.content = content;
    }
}