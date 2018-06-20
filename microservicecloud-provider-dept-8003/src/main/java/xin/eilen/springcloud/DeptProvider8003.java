/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DeptProvider8001
 * FileName: DeptProvider8001
 * Author:   Eilen
 * Date:     2018/6/11 13:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
@EnableDiscoveryClient//服务发现
public class DeptProvider8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003.class,args);
    }
}
