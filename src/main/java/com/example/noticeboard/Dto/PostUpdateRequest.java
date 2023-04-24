package com.example.noticeboard.Dto;

import java.util.Date;

public class PostUpdateRequest {

    private Long id;

    private String title;

    private String content;

    private String writer;

    private Date regDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Date getRegDate() {
        return regDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }
}
