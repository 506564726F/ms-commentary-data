package com.entelgy.web.api.client.proxy;

import com.entelgy.web.api.dto.CommentaryDto;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentaryProxyService {

    @NonNull
    private final CommentaryProxyInterface proxyInterface;

    public List<CommentaryDto> getCommentary() {
        Call<List<CommentaryDto>> call = this.proxyInterface.getCommentaryList();
        try {
            Response<List<CommentaryDto>> response = call.execute();
            if (response.code() == 200) {
                return response.body();
            } else if (response.code() == 404) {
                throw new RuntimeException("No se encontro data");
            } else {
                throw new RuntimeException("Error interno");
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
