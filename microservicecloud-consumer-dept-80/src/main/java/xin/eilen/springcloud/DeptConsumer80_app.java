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

import myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
@RibbonClient(name = "MICROSERVICE-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_app {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_app.class, args);
    }
}
