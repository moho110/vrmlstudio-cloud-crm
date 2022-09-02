package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfWorkplanstateService;
import com.vrcrm.mytable.domain.CmfWorkplanstate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 工作计划状态接口
 */

@Api(value = "工作计划状态接口")
@RestController
@RequestMapping("/api")
public class CmfWorkplanstateController {

    @Autowired
    private ICmfWorkplanstateService cmfWorkplanstateService;

    /**
     * 获取工作计划状态
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取工作计划状态详情失败")
    @ApiOperation(value = "工作计划状态详情", notes = "按ID获取工作计划状态详情")
    @GetMapping(value = "/mytable/workplanstate/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfWorkplanstateService.selectCmfWorkplanstateById(id), HttpStatus.OK);
    }

    /**
     * 获取工作计划状态列表
     * uniapp端调用
     *
     * @param cmfWorkplanstate
     * @return
     */
    @ApiResponse(code = 400, message = "获取工作计划状态列表失败")
    @ApiOperation(value = "工作计划状态列表", notes = "获取工作计划状态列表")
    @GetMapping(value = "/mytable/workplanstate/info/")
    public ResponseEntity<Object> info(CmfWorkplanstate cmfWorkplanstate) throws IOException{
        return new ResponseEntity<>(cmfWorkplanstateService.selectCmfWorkplanstateList(cmfWorkplanstate), HttpStatus.OK);
    }
}