package com.mondris.openfeignrestcall.demo.Service;

import com.mondris.openfeignrestcall.demo.DTO.Comment;
import com.mondris.openfeignrestcall.demo.DTO.Post;
import feign.Param;
import feign.RequestLine;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "postService", url = "https://jsonplaceholder.typicode.com")
public interface PostService {

    @PostMapping("/users")
    Post createPost(@RequestBody Post request);

    @GetMapping("/posts")
    List<Post> getPosts();

    @GetMapping("/posts/{Id}")
    Post getPostById(@PathVariable String Id);

    @PutMapping("/posts/{Id}")
    Post updatePost(@PathVariable  long Id, @RequestBody Post request);

    @DeleteMapping("/posts/{Id}")
    void deletePost(@PathVariable long Id);


    @GetMapping("/comments?postId={postId}")
    List<Comment> getPostComments(@PathVariable String postId);
}
