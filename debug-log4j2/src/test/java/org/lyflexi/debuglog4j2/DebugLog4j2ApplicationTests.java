package org.lyflexi.debuglog4j2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DebugLog4j2ApplicationTests {

    @Test
    void contextLoads() {
        log.info("Hello World:{}","张三");
        log.debug("Hello World:{}","张三");
        log.error("Hello World:{}","张三");}


}
