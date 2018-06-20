/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: config_app_3344
 * FileName: config_app_3344
 * Author:   Eilen
 * Date:     2018/6/13 15:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import sun.applet.Main;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/13
 * @since 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class Config_app_3344 {
    public static void main(String[] args) {
        SpringApplication.run(Config_app_3344.class,args);
    }
}
