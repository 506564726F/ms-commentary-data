package com.entelgy.web.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class RespondeDto {

    List<DataDto> data = new ArrayList<>();

    @Getter
    @Setter
    public static class DataDto {
        private int postId;
        private int id;
        private String email;
    }
}
