package dev.yong2ss.feginexample.controller;

import dev.yong2ss.feginexample.common.dto.BaseRequestInfo;
import dev.yong2ss.feginexample.common.dto.BaseResponseInfo;
import feign.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
    FeignClient Test를 위해 내부에서 다른 서버라 생각하고 정의
 */

@RestController
@RequestMapping("/target_server")
public class TargetController {
    @GetMapping("/get")
    public BaseResponseInfo demoGet(@RequestHeader("CustomHeaderName") String header,
                                    @RequestParam("name") String name,
                                    @RequestParam("age") Long age) {
        return BaseResponseInfo.builder()
                                .header(header)
                                .name(name)
                                .age(age)
                                .build();
    }

    @PostMapping("/post")
    public BaseResponseInfo demoPost(@RequestHeader("CustomHeaderName") String header,
                                     @RequestBody BaseRequestInfo body) {
        return BaseResponseInfo.builder()
                .header(header)
                .name(body.getName())
                .age(body.getAge())
                .build();
    }

    @GetMapping("/error")
    public ResponseEntity<BaseResponseInfo> demoErrorDecoder() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
