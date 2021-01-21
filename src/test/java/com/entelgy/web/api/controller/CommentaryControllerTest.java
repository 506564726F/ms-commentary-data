package com.entelgy.web.api.controller;

import com.entelgy.web.api.dto.RespondeDto;
import com.entelgy.web.api.service.GetCommentaryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CommentaryControllerTest {

    @Mock
    private GetCommentaryService commentaryService;

    private CommentaryController controller;

    @BeforeEach
    public void init() {
        this.controller = new CommentaryController(this.commentaryService);
    }

    @Test
    void CommentaryControllerSuccessfullyTest() {
        Mockito.when(this.commentaryService.getCommentary()).thenReturn(new RespondeDto());
        assertNotNull(this.controller.consult());
    }
}
