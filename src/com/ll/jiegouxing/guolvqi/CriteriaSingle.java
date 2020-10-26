package com.ll.jiegouxing.guolvqi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/26 0026 上午 10:52
 */

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMarrierStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }

}
