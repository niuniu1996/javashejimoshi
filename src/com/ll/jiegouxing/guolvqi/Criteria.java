package com.ll.jiegouxing.guolvqi;

import java.util.List;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/26 0026 上午 10:37
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
