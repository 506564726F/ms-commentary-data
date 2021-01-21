package com.entelgy.web.api.service.impl;

import com.entelgy.web.api.client.service.CommentaryClientService;
import com.entelgy.web.api.dto.RespondeDto;
import com.entelgy.web.api.service.GetCommentaryService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GetCommentaryServiceImpl implements GetCommentaryService {

    @NonNull
    private final CommentaryClientService clientService;

    @Override
    public RespondeDto getCommentary() {

        var commentaryDtoList = this.clientService.getCommentaryClient();
        RespondeDto respondeDto = new RespondeDto();
        List<RespondeDto.DataDto> dataDtoList = new ArrayList<>();

        commentaryDtoList.forEach(l -> {
            RespondeDto.DataDto dataDto = new RespondeDto.DataDto();
            dataDto.setPostId(l.getPostId());
            dataDto.setId(l.getId());
            dataDto.setEmail(l.getEmail());

            dataDtoList.add(dataDto);
            respondeDto.setData(dataDtoList);
        });

        return respondeDto;
    }
}
