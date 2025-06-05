package com.project.demo.controller;

import com.project.demo.entity.HealthReporting;
import com.project.demo.service.HealthReportingService;
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
 * 健康上报：(HealthReporting)表控制层
 *
 */
@RestController
@RequestMapping("/health_reporting")
public class HealthReportingController extends BaseController<HealthReporting, HealthReportingService> {

    /**
     * 健康上报对象
     */
    @Autowired
    public HealthReportingController(HealthReportingService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
