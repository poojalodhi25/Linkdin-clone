package com.linkdinproject.upload_service.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploaderService {

    String upload(MultipartFile file);

}

