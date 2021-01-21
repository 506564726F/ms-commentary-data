package com.entelgy.web.api.service;

import com.entelgy.web.api.client.proxy.CommentaryProxyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class GetCommentaryServiceTest {

    @Autowired
    private GetCommentaryService commentaryService;

    @Autowired
    private CommentaryProxyService proxyService;

    @Test
    void GetCommentaryServiceSuccessfullyTest() {
        assertNotNull(this.commentaryService.getCommentary());
    }
}
