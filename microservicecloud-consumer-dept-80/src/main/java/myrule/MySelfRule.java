/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: MySelfRule
 * FileName: MySelfRule
 * Author:   Eilen
 * Date:     2018/6/12 12:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈describe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/12
 * @since 1.0.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule_RS();
    }
}
