package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfCrmDictServicetypeService;
import com.vrcrm.basicdata.domain.CmfCrmDictServicetype;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 服务类型接口
 */

@Api(value = "服务类型接口")
@RestController
@RequestMapping("/api")
public class CmfCrmDictServicetypesController {

    @Autowired
    private ICmfCrmDictServicetypeService cmfCrmDictServicetypeService;

    /**
     * 获取服务类型详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取服务类型详情失败")
    @ApiOperation(value = "服务类型详情", notes = "按ID获取服务类型详情")
    @GetMapping(value = "/basicdata/dictservicetype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmDictServicetypeService.selectCmfCrmDictServicetypeById(id), HttpStatus.OK);
    }

    /**
     * 获取服务类型列表
     * uniapp端调用
     *
     * @param cmfCrmDictServicetype
     * @return
     */
    @ApiResponse(code = 400, message = "获取服务类型列表失败")
    @ApiOperation(value = "服务类型列表", notes = "获取服务类型列表")
    @GetMapping(value = "/basicdata/dictservicetype/info/")
    public ResponseEntity<Object> info(CmfCrmDictServicetype cmfCrmDictServicetype) throws IOException{
        return new ResponseEntity<>(cmfCrmDictServicetypeService.selectCmfCrmDictServicetypeList(cmfCrmDictServicetype), HttpStatus.OK);
    }
}