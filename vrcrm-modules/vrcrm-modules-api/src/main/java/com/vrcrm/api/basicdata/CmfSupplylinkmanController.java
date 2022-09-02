package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfSupplylinkmanService;
import com.vrcrm.basicdata.domain.CmfSupplylinkman;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 供应商联系人接口
 */

@Api(value = "供应商联系人接口")
@RestController
@RequestMapping("/api")
public class CmfSupplylinkmanController {

    @Autowired
    private ICmfSupplylinkmanService cmfSupplylinkmanService;

    /**
     * 获取供应商联系人详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取供应商联系人详情失败")
    @ApiOperation(value = "供应商联系人详情", notes = "按ID获取供应商联系人详情")
    @GetMapping(value = "/basicdata/supplylinkman/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfSupplylinkmanService.selectCmfSupplylinkmanById(id), HttpStatus.OK);
    }

    /**
     * 获取供应商联系人列表
     * uniapp端调用
     *
     * @param cmfSupplylinkman
     * @return
     */
    @ApiResponse(code = 400, message = "获取供应商联系人列表失败")
    @ApiOperation(value = "供应商联系人列表", notes = "获取供应商联系人列表")
    @GetMapping(value = "/basicdata/supplylinkman/info/")
    public ResponseEntity<Object> info(CmfSupplylinkman cmfSupplylinkman) throws IOException{
        return new ResponseEntity<>(cmfSupplylinkmanService.selectCmfSupplylinkmanList(cmfSupplylinkman), HttpStatus.OK);
    }
}