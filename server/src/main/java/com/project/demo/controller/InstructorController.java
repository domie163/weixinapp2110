package com.project.demo.controller;

import com.project.demo.entity.Instructor;
import com.project.demo.service.InstructorService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 辅导员：(Instructor)表控制层
 *
 */
@RestController
@RequestMapping("/instructor")
public class InstructorController extends BaseController<Instructor, InstructorService> {

    /**
     * 辅导员对象
     */
    @Autowired
    public InstructorController(InstructorService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> maptrainee_no = new HashMap<>();
        maptrainee_no.put("trainee_no",String.valueOf(paramMap.get("trainee_no")));
        List listtrainee_no = service.select(maptrainee_no, new HashMap<>()).getResultList();
        if (listtrainee_no.size()>0){
            return error(30000, "字段辅导员工号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
