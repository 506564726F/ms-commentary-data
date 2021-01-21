package com.entelgy.web.api.controller;

import com.entelgy.web.api.dto.RespondeDto;
import com.entelgy.web.api.service.GetCommentaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentaryController {

    private final GetCommentaryService commentaryService;

    @PostMapping("/commentary-data")
    public ResponseEntity<RespondeDto> consult() {
        return ResponseEntity.ok(this.commentaryService.getCommentary());
    }
}
