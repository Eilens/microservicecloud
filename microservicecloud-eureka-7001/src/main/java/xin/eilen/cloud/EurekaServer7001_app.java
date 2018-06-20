/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: EurekaServer7001_app
 * FileName: EurekaServer7001_app
 * Author:   Eilen
 * Date:     2018/6/11 15:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/11
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_app {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_app.class,args);
    }
}
