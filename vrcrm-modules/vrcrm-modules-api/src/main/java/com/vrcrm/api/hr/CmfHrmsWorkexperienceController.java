package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsWorkexperienceService;
import com.vrcrm.hr.domain.CmfHrmsWorkexperience;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作人员工作经验接口
 */

@Api(value = "工作人员工作经验接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsWorkexperienceController {

    @Autowired
    private ICmfHrmsWorkexperienceService cmfHrmsWorkexperienceService;

    /**
     * 获取工作人员工作经验
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作人员工作经验详情失败")
    @ApiOperation(value = "工作人员工作经验详情", notes = "按ID获取工作人员工作经验详情")
    @GetMapping(value = "/hr/workexperience/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsWorkexperienceService.selectCmfHrmsWorkexperienceById(id), HttpStatus.OK);
    }

    /**
     * 获取工作人员工作经验列表
     * uniapp端调用
     *
     * @param cmfHrmsWorkexperience
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作人员工作经验列表失败")
    @ApiOperation(value = "工作人员工作经验列表", notes = "获取工作人员工作经验列表")
    @GetMapping(value = "/hr/workexperience/info/")
    public ResponseEntity<Object> info(CmfHrmsWorkexperience cmfHrmsWorkexperience) throws IOException{
        return new ResponseEntity<>(cmfHrmsWorkexperienceService.selectCmfHrmsWorkexperienceList(cmfHrmsWorkexperience), HttpStatus.OK);
    }
}