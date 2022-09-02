package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfSupplyleverService;
import com.vrcrm.basicdata.domain.CmfSupplylever;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 供应商等级接口
 */

@Api(value = "供应商等级接口")
@RestController
@RequestMapping("/api")
public class CmfSupplyleverController {

    @Autowired
    private ICmfSupplyleverService cmfSupplyleverService;

    /**
     * 获取供应商等级详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取供应商等级详情失败")
    @ApiOperation(value = "供应商等级详情", notes = "按ID获取供应商等级详情")
    @GetMapping(value = "/basicdata/supplylever/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfSupplyleverService.selectCmfSupplyleverById(id), HttpStatus.OK);
    }

    /**
     * 获取供应商等级列表
     * uniapp端调用
     *
     * @param cmfSupplylever
     * @return
     */
    @ApiResponse(code = 400, message = "获取供应商等级列表失败")
    @ApiOperation(value = "供应商等级列表", notes = "获取供应商等级列表")
    @GetMapping(value = "/basicdata/supplylever/info/")
    public ResponseEntity<Object> info(CmfSupplylever cmfSupplylever) throws IOException{
        return new ResponseEntity<>(cmfSupplyleverService.selectCmfSupplyleverList(cmfSupplylever), HttpStatus.OK);
    }
}