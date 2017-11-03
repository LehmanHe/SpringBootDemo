package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lehman on 17/11/3.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @RequestMapping(value = "/girls", method = RequestMethod.GET)
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * add a girl
     * @param age
     * @param cupSize
     * @return
     */
    @PostMapping("/girls")
    public Girl girlAdd(@RequestParam("age") Integer age, @RequestParam("cupSize") String cupSize){
        Girl girl=new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);
    }

    @GetMapping("/girl/<id>")
    public Girl getGirl(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }

    @DeleteMapping("/girl/<id>")
    public void deleteGirl(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

    @PutMapping("/girl/modify")
    public void putGirl(@RequestParam("id") Integer id, @RequestParam("cupSize") String cupSize){
        girlRepository.updateGirlById(cupSize, id);
    }
}
