/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: Zuu_9527_startSpringcloud
 * FileName: Zuu_9527_startSpringcloud
 * Author:   Eilen
 * Date:     2018/6/13 14:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/13
 * @since 1.0.0
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuu_9527_startSpringcloud {
    public static void main(String[] args) {
        SpringApplication.run(Zuu_9527_startSpringcloud.class,args);
    }
}
