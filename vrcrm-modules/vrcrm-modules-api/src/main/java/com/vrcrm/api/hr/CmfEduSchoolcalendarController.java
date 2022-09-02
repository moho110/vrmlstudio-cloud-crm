package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduSchoolcalendarService;
import com.vrcrm.hr.domain.CmfEduSchoolcalendar;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 校历接口
 */

@Api(value = "校历接口")
@RestController
@RequestMapping("/api")
public class CmfEduSchoolcalendarController {

    @Autowired
    private ICmfEduSchoolcalendarService cmfEduSchoolcalendarService;

    /**
     * 获取校历详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取校历详情失败")
    @ApiOperation(value = "校历详情", notes = "按ID获取校历详情")
    @GetMapping(value = "/hr/eduschoolcalendar/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduSchoolcalendarService.selectCmfEduSchoolcalendarById(id), HttpStatus.OK);
    }

    /**
     * 获取校历列表
     * uniapp端调用
     *
     * @param cmfEduSchoolcalendar
     * @return
     */
    @ApiResponse(code = 400, message = "获取校历列表失败")
    @ApiOperation(value = "校历列表", notes = "获取校历列表")
    @GetMapping(value = "/hr/eduschoolcalendar/info/")
    public ResponseEntity<Object> info(CmfEduSchoolcalendar cmfEduSchoolcalendar) throws IOException{
        return new ResponseEntity<>(cmfEduSchoolcalendarService.selectCmfEduSchoolcalendarList(cmfEduSchoolcalendar), HttpStatus.OK);
    }
}