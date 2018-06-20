/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: DeptMapper
 * FileName: DeptMapper
 * Author:   Eilen
 * Date:     2018/6/11 13:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package xin.eilen.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
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
@Mapper
public interface DeptMapper {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
