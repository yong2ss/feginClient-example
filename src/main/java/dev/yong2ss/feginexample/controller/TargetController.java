package dev.yong2ss.feginexample.controller;

import dev.yong2ss.feginexample.common.dto.BaseResponseInfo;
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
}
