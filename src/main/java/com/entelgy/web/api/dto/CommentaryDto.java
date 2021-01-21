package com.entelgy.web.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public class CommentaryDto {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
