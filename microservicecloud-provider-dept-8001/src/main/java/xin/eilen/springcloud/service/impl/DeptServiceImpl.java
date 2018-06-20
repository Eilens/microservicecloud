/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DeptServiceImpl
 * FileName: DeptServiceImpl
 * Author:   Eilen
 * Date:     2018/6/11 13:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.eilen.springcloud.entity.Dept;
import xin.eilen.springcloud.mapper.DeptMapper;
import xin.eilen.springcloud.service.DeptService;

import java.util.List;

/**
 * 〈describe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/11
 * @since 1.0.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper mapper;

    @Override
    public boolean add(Dept dept) {
        return mapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return mapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return mapper.findAll();
    }
}
