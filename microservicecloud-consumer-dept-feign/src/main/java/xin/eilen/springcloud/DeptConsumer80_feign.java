/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DeptConsumer80_app
 * FileName: DeptConsumer80_app
 * Author:   Eilen
 * Date:     2018/6/11 14:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 〈describe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/11
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"xin.eilen.springcloud"})
@ComponentScan("xin.eilen.springcloud")
public class DeptConsumer80_feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_feign.class, args);
    }
}
