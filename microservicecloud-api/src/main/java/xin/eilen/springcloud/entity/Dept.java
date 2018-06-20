package xin.eilen.springcloud.entity; /**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: Dept
 * FileName: Dept
 * Author:   Eilen
 * Date:     2018/6/11 12:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 〈describe〉<br>
 * 〈〉
 *
 * @author Eilen
 * @create 2018/6/11
 * @since 1.0.0
 */
@AllArgsConstructor
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;
}
