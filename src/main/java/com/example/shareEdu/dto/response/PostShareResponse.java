package com.example.shareEdu.dto.response;

import com.example.shareEdu.entity.Post;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PostShareResponse {
    Long id;
    PostResponse post;
    String caption;
    UserResponse author;
    LocalDateTime shareAt;

}
