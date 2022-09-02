package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsLaboringskillService;
import com.vrcrm.hr.domain.CmfHrmsLaboringskill;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 人员技能接口
 */

@Api(value = "人员技能接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsLaboringskillController {

    @Autowired
    private ICmfHrmsLaboringskillService cmfHrmsLaboringskillService;

    /**
     * 获取人员技能详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取人员技能详情失败")
    @ApiOperation(value = "人员技能详情", notes = "按ID获取人员技能详情")
    @GetMapping(value = "/hr/laboringskill/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsLaboringskillService.selectCmfHrmsLaboringskillById(id), HttpStatus.OK);
    }

    /**
     * 获取人员技能列表
     * uniapp端调用
     *
     * @param cmfHrmsLaboringskill
     * @return
     */
    @ApiResponse(code = 400, message = "获取人员技能列表失败")
    @ApiOperation(value = "人员技能列表", notes = "获取人员技能列表")
    @GetMapping(value = "/hr/laboringskill/info/")
    public ResponseEntity<Object> info(CmfHrmsLaboringskill cmfHrmsLaboringskill) throws IOException{
        return new ResponseEntity<>(cmfHrmsLaboringskillService.selectCmfHrmsLaboringskillList(cmfHrmsLaboringskill), HttpStatus.OK);
    }
}