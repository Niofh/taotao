package com.taotao.controller;

import com.fastdfs.client.FastDFSClient;
import com.fastdfs.client.FastDFSException;
import com.fastdfs.client.FileResponseData;
import com.taotao.dto.KindEditorJson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * 上传文件
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/22 14:00
 */
@Controller
public class FileUploadController {
    private FastDFSClient fastDFSClient = new FastDFSClient();

    /**
     * 文件服务器地址
     */
    @Value("${file_server_addr}")
    private String fileServerAddr;

    /**
     * 上传文件
     * @param file
     * @param request
     * @return
     */
    @RequestMapping("/pic/upload")
    @ResponseBody
    public KindEditorJson uploadFile(@RequestParam("uploadFile") MultipartFile file, HttpServletRequest request) {
        FileResponseData fileResponseData = this.uploadSample(file, request);
        System.out.println(fileResponseData);

        KindEditorJson kindEditorJson = new KindEditorJson();

        if (fileResponseData.isSuccess()) {
            kindEditorJson.setError(0);
        } else {
            kindEditorJson.setError(1);
        }
        kindEditorJson.setMessage(fileResponseData.getMessage());
        kindEditorJson.setUrl(fileResponseData.getHttpUrl());

        return kindEditorJson;
    }


    /**
     * 上传通用方法，只上传到服务器，不保存记录到数据库
     *
     * @param file
     * @param request
     * @return
     */
    public FileResponseData uploadSample(MultipartFile file, HttpServletRequest request) {
        FileResponseData responseData = new FileResponseData();
        try {

            // 上传到服务器
            String filepath = fastDFSClient.uploadFileWithMultipart(file);
            responseData.setFileName(file.getOriginalFilename());
            responseData.setFilePath(filepath);
            responseData.setFileType(FastDFSClient.getFilenameSuffix(file.getOriginalFilename()));
            responseData.setHttpUrl(fileServerAddr+"/"+filepath);
        } catch (FastDFSException e) {
            responseData.setSuccess(false);
            responseData.setCode(e.getCode());
            responseData.setMessage(e.getMessage());
        }

        return responseData;
    }

}
