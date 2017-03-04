package cloud.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/3/3.
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${mysqldb.datasource.username}")
    private String userName;
    @Value("${mysqldb.datasource.password}")
    private String passWord;
    @Value("${mysqldb.datasource.url}")
    private String url;

    @RequestMapping("from")
    public String from() {
        return String.format("[%s | %s | %s]", userName, passWord, url);
    }
}
