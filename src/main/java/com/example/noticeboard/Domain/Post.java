package com.example.noticeboard.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    private String title;

    private String content;

    private String writer;

    private Date regDate;

    private Date updateDate;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Post() {

    }

    public Post(String title, String content, String writer, Date regDate, Date updateDate) {
        if(title == null || title.isBlank() || content == null || content.isBlank()){
            throw new IllegalArgumentException("게시글 정보를 다시 확인해주세요");
        }
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.regDate = regDate;
        this.updateDate = updateDate;
    }

    public void updatePost(String title, String content, String writer, Date updateDate){
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.updateDate = updateDate;
    }

}
