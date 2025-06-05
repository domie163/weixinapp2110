package com.project.demo.controller;

import com.project.demo.entity.HousingManagementUsers;
import com.project.demo.service.HousingManagementUsersService;
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
 * 宿管用户：(HousingManagementUsers)表控制层
 *
 */
@RestController
@RequestMapping("/housing_management_users")
public class HousingManagementUsersController extends BaseController<HousingManagementUsers, HousingManagementUsersService> {

    /**
     * 宿管用户对象
     */
    @Autowired
    public HousingManagementUsersController(HousingManagementUsersService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> maphanguan_job_number = new HashMap<>();
        maphanguan_job_number.put("hanguan_job_number",String.valueOf(paramMap.get("hanguan_job_number")));
        List listhanguan_job_number = service.select(maphanguan_job_number, new HashMap<>()).getResultList();
        if (listhanguan_job_number.size()>0){
            return error(30000, "字段宿管工号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
