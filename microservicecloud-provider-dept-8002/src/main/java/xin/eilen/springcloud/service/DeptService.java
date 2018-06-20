/**
 * Copyright (C), 2013-2018, 中商惠民科技有限公司
 * FileName: DeptService
 * Author:   Eilen
 * Date:     2018/6/11 13:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 */
package xin.eilen.springcloud.service;

import xin.eilen.springcloud.entity.Dept;

import java.util.List;

/**
 * 〈discripe〉<br> 
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/11
 * @since 1.0.0
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
