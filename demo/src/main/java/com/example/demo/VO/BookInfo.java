package com.example.demo.VO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope   //配置热更新
/**
 * description:
 *
 * @param
 * @author
 * @return
 */
public class BookInfo {
    @Value("${test}")
    private String useLocalCache;

    @RequestMapping("/get")
    public String get() {
        return useLocalCache;
    }
}
