/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: RandomRule_RS
 * FileName: RandomRule_RS
 * Author:   Eilen
 * Date:     2018/6/12 13:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * 〈describe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/12
 * @since 1.0.0
 */
public class RandomRule_RS extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    private int totol = 0;//当total为5以后，指针才往下移一次
    private int currentIndex = 0;//当前对外提供的服务器地址

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;
        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> allList = lb.getAllServers();
            List<Server> upList = lb.getReachableServers();
            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }
            if (totol <= 3) {
                server = upList.get(currentIndex);
                totol++;
            } else {
                totol = 0;
                currentIndex++;
                if (currentIndex >= upList.size()) {
                    currentIndex = 0;
                }
            }
            if (server == null) {
                Thread.yield();
                continue;
            }
            if (server.isAlive()) {
                return (server);
            }
            server = null;
            Thread.yield();
        }
        return server;
    }
}
