package com.devteria.post.mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.devteria.post.dto.response.PostResponse;
import com.devteria.post.entity.Post;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostResponse toPostResponse(Post post);
}
