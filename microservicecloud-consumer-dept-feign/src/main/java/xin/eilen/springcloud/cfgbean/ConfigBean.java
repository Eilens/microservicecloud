/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: ConfigBean
 * FileName: ConfigBean
 * Author:   Eilen
 * Date:     2018/6/11 14:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 〈describe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/11
 * @since 1.0.0
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced  //配置负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @Bean
    public IRule myRule(){
        //return new RandomRule();//达到目的，用我们才重新选择的随机算法替代默认轮询
        return  new RetryRule();//轮询随机重试
    }
}
