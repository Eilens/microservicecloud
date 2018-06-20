/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DeptController
 * FileName: DeptController
 * Author:   Eilen
 * Date:     2018/6/11 14:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xin.eilen.springcloud.entity.Dept;

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
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX = "http://localhost:8001/";
    private static final String REST_URL_PREFIX = "http://MICROSERVICE-DEPT/";

    @PostMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
    }
    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }
    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        List forObject = restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
        return forObject;
    }
}
