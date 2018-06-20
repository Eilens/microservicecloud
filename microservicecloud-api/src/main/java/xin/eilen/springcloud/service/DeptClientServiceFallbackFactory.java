/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DeptClientServiceFallbackFactory
 * FileName: DeptClientServiceFallbackFactory
 * Author:   Eilen
 * Date:     2018/6/12 16:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import xin.eilen.springcloud.entity.Dept;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈describe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/12
 * @since 1.0.0
 */
@Component//必须要添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Long id) {
                return new Dept().setDname("出错了");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public Boolean add(Dept dept) {
                return null;
            }
        };
    }
}
