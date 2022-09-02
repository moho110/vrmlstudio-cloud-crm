package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfWorkplanshenheService;
import com.vrcrm.mytable.domain.CmfWorkplanshenhe;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作计划审核接口
 */

@Api(value = "工作计划审核接口")
@RestController
@RequestMapping("/api")
public class CmfWorkplanshenheController {

    @Autowired
    private ICmfWorkplanshenheService cmfWorkplanshenheService;

    /**
     * 获取工作计划审核
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作计划审核详情失败")
    @ApiOperation(value = "工作计划审核详情", notes = "按ID获取工作计划审核详情")
    @GetMapping(value = "/mytable/workplanshenhe/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfWorkplanshenheService.selectCmfWorkplanshenheById(id), HttpStatus.OK);
    }

    /**
     * 获取工作计划审核列表
     * uniapp端调用
     *
     * @param cmfWorkplanshenhe
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作计划审核列表失败")
    @ApiOperation(value = "工作计划审核列表", notes = "获取工作计划审核列表")
    @GetMapping(value = "/mytable/workplanshenhe/info/")
    public ResponseEntity<Object> info(CmfWorkplanshenhe cmfWorkplanshenhe) throws IOException{
        return new ResponseEntity<>(cmfWorkplanshenheService.selectCmfWorkplanshenheList(cmfWorkplanshenhe), HttpStatus.OK);
    }
}