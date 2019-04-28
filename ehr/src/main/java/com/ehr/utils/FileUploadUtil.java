package com.ehr.utils;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.ehr.pojo.ParamMapping;

public class FileUploadUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileUploadUtil.class);

	public static final String PHOTO_SAVE_PATH ="/upload/photos/";
	
	public static final String FILE_SAVE_PATH = "/upload/uploadfiles/";
	
	public static EhrResult uploadPhoto(MultipartFile photo)  {
		return upload(PHOTO_SAVE_PATH,photo);
	}
	
	public static EhrResult uploadFile(MultipartFile uploadFile) {
		return upload(FILE_SAVE_PATH,uploadFile);
	}
	
	public static EhrResult upload(String savePath , MultipartFile file) {
		File filePath = new File(savePath + file.getOriginalFilename());
        try {
        	//判断上传文件的保存目录是否存在
        	File pFile = filePath.getParentFile();
        	if(!pFile.exists() || !pFile.isDirectory()) {
        		pFile.mkdirs();
        		filePath.createNewFile();
        	}
        	//消息提示
			file.transferTo(filePath);
		} catch (IllegalStateException e) {
			LOGGER.info(e.getMessage());
			return EhrResult.build(500,ParamMapping.UPLOAD_FILE_FAILED);
		} catch (IOException e) {
			LOGGER.info(e.getMessage());
			return EhrResult.build(500,ParamMapping.UPLOAD_FILE_FAILED);
		}
        return EhrResult.ok(filePath.getAbsolutePath());
	}
}
