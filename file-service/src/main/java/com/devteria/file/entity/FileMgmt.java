package com.devteria.file.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "file_mgmt")
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class FileMgmt {
    @MongoId
    String id;
    String ownerId;
    String contentType;
    long size;
    String md5checksum;
    String path;
}
