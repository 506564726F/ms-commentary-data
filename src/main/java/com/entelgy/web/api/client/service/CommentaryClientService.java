package com.entelgy.web.api.client.service;

import com.entelgy.web.api.dto.CommentaryDto;

import java.util.List;

public interface CommentaryClientService {
    List<CommentaryDto> getCommentaryClient();
}
