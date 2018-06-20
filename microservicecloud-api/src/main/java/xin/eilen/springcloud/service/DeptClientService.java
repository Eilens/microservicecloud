/**
 * Copyright (C), 2013-2018, 中商惠民科技有限公司
 * FileName: DeptClientService
 * Author:   Eilen
 * Date:     2018/6/12 15:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 */
package xin.eilen.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import xin.eilen.springcloud.entity.Dept;

import java.util.List;

/**
 * 〈discripe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/12
 * @since 1.0.0
 */
//@FeignClient(value = "MICROSERVICE-DEPT")
@FeignClient(value = "MICROSERVICE-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    public List<Dept> list();

    @PostMapping("/dept/add")
    public Boolean add(Dept dept);
}
