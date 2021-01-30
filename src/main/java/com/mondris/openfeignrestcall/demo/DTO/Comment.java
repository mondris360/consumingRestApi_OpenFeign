package com.mondris.openfeignrestcall.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment {
    private long postId;
    private long id;
    private String name;
    private String email;
    private String body;
}

