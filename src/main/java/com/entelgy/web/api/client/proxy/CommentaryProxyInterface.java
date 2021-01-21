package com.entelgy.web.api.client.proxy;

import com.entelgy.web.api.dto.CommentaryDto;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CommentaryProxyInterface {

    @GET("comments")
    Call<List<CommentaryDto>> getCommentaryList();
}
