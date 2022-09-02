package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfCrmDictServicesourceService;
import com.vrcrm.basicdata.domain.CmfCrmDictServicesource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 服务来源接口
 */

@Api(value = "服务来源接口")
@RestController
@RequestMapping("/api")
public class CmfCrmDictServicesourcesController {

    @Autowired
    private ICmfCrmDictServicesourceService cmfCrmDictServicesourceService;

    /**
     * 获取服务来源详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取服务来源详情失败")
    @ApiOperation(value = "服务来源详情", notes = "按ID获取服务来源详情")
    @GetMapping(value = "/basicdata/dictservicesource/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmDictServicesourceService.selectCmfCrmDictServicesourceById(id), HttpStatus.OK);
    }

    /**
     * 获取服务来源列表
     * uniapp端调用
     *
     * @param cmfCrmDictServicesource
     * @return
     */
    @ApiResponse(code = 400, message = "获取服务来源列表失败")
    @ApiOperation(value = "服务来源列表", notes = "获取服务来源列表")
    @GetMapping(value = "/basicdata/dictservicesource/info/")
    public ResponseEntity<Object> info(CmfCrmDictServicesource cmfCrmDictServicesource) throws IOException{
        return new ResponseEntity<>(cmfCrmDictServicesourceService.selectCmfCrmDictServicesourceList(cmfCrmDictServicesource), HttpStatus.OK);
    }
}