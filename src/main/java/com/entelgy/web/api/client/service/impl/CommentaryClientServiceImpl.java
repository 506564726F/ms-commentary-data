package com.entelgy.web.api.client.service.impl;

import com.entelgy.web.api.client.proxy.CommentaryProxyService;
import com.entelgy.web.api.client.service.CommentaryClientService;
import com.entelgy.web.api.dto.CommentaryDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CommentaryClientServiceImpl implements CommentaryClientService {

    @NonNull
    private final CommentaryProxyService proxyService;

    @Override
    public List<CommentaryDto> getCommentaryClient() {
        return this.proxyService.getCommentary();
    }
}
