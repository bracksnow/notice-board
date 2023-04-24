package com.example.noticeboard.Service;

import com.example.noticeboard.Domain.Post;
import com.example.noticeboard.Domain.PostRepository;
import com.example.noticeboard.Dto.PostCreateRequest;
import com.example.noticeboard.Dto.PostUpdateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class postService {

    private final PostRepository postRepository;

    public postService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    //게시글 저장기능 구현
    @Transactional
    public void saveBoard(PostCreateRequest request){
        postRepository.save(new Post(request.getTitle(), request.getContent(), request.getWriter(), request.getRegDate(), request.getUpdateDate()));

    }

    //삭제 기능 구현
    @Transactional
    public void deleteBoard(Long id){
        Post post = postRepository.findById(id).orElseThrow();
        postRepository.delete(post);
    }

    //수정기능 구현
    @Transactional
    public void updateBoard(PostUpdateRequest request){
        Post post = postRepository.findById(request.getId()).orElseThrow(IllegalAccessError::new);
        post.updatePost(request.getTitle(), request.getContent(), request.getWriter(), request.getUpdateDate());
        postRepository.save(post);

    }


}
