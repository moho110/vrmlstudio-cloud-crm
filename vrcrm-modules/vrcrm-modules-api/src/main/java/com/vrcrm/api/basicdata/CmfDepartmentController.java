package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfDepartmentService;
import com.vrcrm.basicdata.domain.CmfDepartment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 部门管理接口
 */

@Api(value = "部门管理接口")
@RestController
@RequestMapping("/api")
public class CmfDepartmentController {

    @Autowired
    private ICmfDepartmentService cmfDepartmentService;

    /**
     * 获取部门管理详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取部门管理详情失败")
    @ApiOperation(value = "部门管理详情", notes = "按ID获取部门管理详情")
    @GetMapping(value = "/basicdata/department/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDepartmentService.selectCmfDepartmentById(id), HttpStatus.OK);
    }

    /**
     * 获取部门管理列表
     * uniapp端调用
     *
     * @param cmfDepartment
     * @return
     */
    @ApiResponse(code = 400, message = "获取部门管理列表失败")
    @ApiOperation(value = "部门管理列表", notes = "获取部门管理列表")
    @GetMapping(value = "/basicdata/department/info/")
    public ResponseEntity<Object> info(CmfDepartment cmfDepartment) throws IOException{
        return new ResponseEntity<>(cmfDepartmentService.selectCmfDepartmentList(cmfDepartment), HttpStatus.OK);
    }
}