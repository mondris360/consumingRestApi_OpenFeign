package com.mondris.openfeignrestcall.demo.Controller;

import com.mondris.openfeignrestcall.demo.DTO.Comment;
import com.mondris.openfeignrestcall.demo.DTO.Post;
import com.mondris.openfeignrestcall.demo.Service.PostService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {
    @Resource
    private PostService postService;


    @PostMapping("/posts")
    public Post createPost(@RequestBody Post request){
        return postService.createPost(request);
    }

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postService.getPosts();
    }

    @GetMapping("/posts/{Id}")
    public Post  getPostById(@PathVariable String Id){
       return postService.getPostById(Id);
    }

    @PutMapping("/posts/{Id}")
    public Post updatePost(@PathVariable  long Id, @RequestBody Post request){
        return postService.updatePost(Id, request);
    }

    @DeleteMapping("/posts/{Id}")
    public String deletePost(@PathVariable long Id) {
        postService.deletePost(Id);
        return "Post with Id: " + Id + "Was deleted Successful";
    }

    @GetMapping("/comments")
    public List<Comment> getPostComments(@RequestParam String postId) {
        return postService.getPostComments(postId);
    }

}
