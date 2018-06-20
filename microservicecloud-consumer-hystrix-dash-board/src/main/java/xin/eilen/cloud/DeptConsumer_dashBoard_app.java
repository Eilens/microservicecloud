/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DeptConsumer_dashBoard_app
 * FileName: DeptConsumer_dashBoard_app
 * Author:   Eilen
 * Date:     2018/6/12 17:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/12
 * @since 1.0.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_dashBoard_app {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_dashBoard_app.class,args);
    }
}
