package com.frs.service;

import com.frs.domain.Girl;
import com.frs.enums.ResultEnum;
import com.frs.exception.GirlException;
import com.frs.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(11);

        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(15);

        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findById(id).get();
        Integer age = girl.getAge();
        if (age < 11) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOLL);
        } else if (age >= 11 && age < 18) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }
}
