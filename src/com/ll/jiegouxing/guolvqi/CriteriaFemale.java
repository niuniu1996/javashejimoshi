package com.ll.jiegouxing.guolvqi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/26 0026 上午 10:50
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalelist = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getSex().equalsIgnoreCase("female")) {
                femalelist.add(person);
            }
        }
        return femalelist;
    }
}
