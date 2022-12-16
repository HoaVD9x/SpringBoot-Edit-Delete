package com.example.springboottutorial.rest;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RestController
public class DownloadUploadController {


//    @PostMapping(value = "/uploading", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {
//        FileOutputStream stream = null;
//        String filePath = null;
//        try {
//            File file = new File("F:\\Giang day lap trinh\\spring-file\\" + multipartFile.getOriginalFilename());
//            file.createNewFile();
//            stream = new FileOutputStream(file);
//            stream.write(multipartFile.getBytes());
//            filePath = file.getAbsolutePath();
//        } catch (IOException ignored) {
//
//        } finally {
//            if (stream != null)
//                stream.close();
//        }
//        return ResponseEntity.ok(filePath);
//    }
//
//    @GetMapping("/downloading")
//    public ResponseEntity<Object> downloading() {
//
//        String fileName = "F:\\Giang day lap trinh\\spring-file\\file_example_MP4_1920_18MG.mp4";
//        File file = new File(fileName);
//        try {
//            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
//            HttpHeaders headers = new HttpHeaders();
//            headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
//            headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
//            headers.add("Pragma", "no-cache");
//            headers.add("Expires", "0");
//            return ResponseEntity.ok().headers(headers).contentLength(file.length())
//                    .contentType(MediaType.parseMediaType("video/mp4")).body(resource);
//        } catch (FileNotFoundException exception) {
//            System.out.println(exception.getMessage());
//        }
//        return ResponseEntity.ok().build();
//    }
}
