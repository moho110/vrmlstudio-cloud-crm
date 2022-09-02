package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfCrmDictServicestatusService;
import com.vrcrm.basicdata.domain.CmfCrmDictServicestatus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 服务状态接口
 */

@Api(value = "服务状态接口")
@RestController
@RequestMapping("/api")
public class CmfCrmDictServicestatusController {

    @Autowired
    private ICmfCrmDictServicestatusService cmfCrmDictServicestatusService;

    /**
     * 获取服务状态详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取服务状态详情失败")
    @ApiOperation(value = "服务状态详情", notes = "按ID获取服务状态详情")
    @GetMapping(value = "/basicdata/dictservicestatus/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmDictServicestatusService.selectCmfCrmDictServicestatusById(id), HttpStatus.OK);
    }

    /**
     * 获取服务状态列表
     * uniapp端调用
     *
     * @param cmfCrmDictServicestatus
     * @return
     */
    @ApiResponse(code = 400, message = "获取服务状态列表失败")
    @ApiOperation(value = "服务状态列表", notes = "获取服务状态列表")
    @GetMapping(value = "/basicdata/dictservicestatus/info/")
    public ResponseEntity<Object> info(CmfCrmDictServicestatus cmfCrmDictServicestatus) throws IOException{
        return new ResponseEntity<>(cmfCrmDictServicestatusService.selectCmfCrmDictServicestatusList(cmfCrmDictServicestatus), HttpStatus.OK);
    }
}