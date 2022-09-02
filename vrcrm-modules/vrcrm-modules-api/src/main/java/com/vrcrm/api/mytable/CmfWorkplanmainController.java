package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfWorkplanmainService;
import com.vrcrm.mytable.domain.CmfWorkplanmain;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作计划接口
 */

@Api(value = "工作计划接口")
@RestController
@RequestMapping("/api")
public class CmfWorkplanmainController {

    @Autowired
    private ICmfWorkplanmainService cmfWorkplanmainService;

    /**
     * 获取工作计划
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作计划详情失败")
    @ApiOperation(value = "工作计划详情", notes = "按ID获取工作计划详情")
    @GetMapping(value = "/mytable/workplanmain/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfWorkplanmainService.selectCmfWorkplanmainById(id), HttpStatus.OK);
    }

    /**
     * 获取工作计划列表
     * uniapp端调用
     *
     * @param cmfWorkplanmain
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作计划列表失败")
    @ApiOperation(value = "工作计划列表", notes = "获取工作计划列表")
    @GetMapping(value = "/mytable/workplanmain/info/")
    public ResponseEntity<Object> info(CmfWorkplanmain cmfWorkplanmain) throws IOException{
        return new ResponseEntity<>(cmfWorkplanmainService.selectCmfWorkplanmainList(cmfWorkplanmain), HttpStatus.OK);
    }
}