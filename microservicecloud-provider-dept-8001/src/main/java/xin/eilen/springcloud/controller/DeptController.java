/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DeptController
 * FileName: DeptController
 * Author:   Eilen
 * Date:     2018/6/11 13:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import xin.eilen.springcloud.entity.Dept;
import xin.eilen.springcloud.service.DeptService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈describe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/11
 * @since 1.0.0
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    @Resource
    private DiscoveryClient client;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "fallbackFalse_get")
    public Dept add(@PathVariable("id") Long id) {
        Dept dept = service.get(id);
        if(dept == null){
            throw new RuntimeException("出错了");
        }
        return dept;
    }
    public Dept fallbackFalse_get(@PathVariable("id")Long id){
        return new Dept().setDname("你输入的id为："+id+",没有查到该数据");
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }


    @GetMapping(value = "/dept/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println(list);
        List<ServiceInstance> instances = client.getInstances("MICROSERVICE-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.client;
    }
}
