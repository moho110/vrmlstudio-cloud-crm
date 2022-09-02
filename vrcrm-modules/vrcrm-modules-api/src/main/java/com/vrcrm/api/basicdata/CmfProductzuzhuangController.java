package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfProductzuzhuangService;
import com.vrcrm.basicdata.domain.CmfProductzuzhuang;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 产品组装明细接口
 */

@Api(value = "产品组装明细接口")
@RestController
@RequestMapping("/api")
public class CmfProductzuzhuangController {

    @Autowired
    private ICmfProductzuzhuangService cmfProductzuzhuangService;

    /**
     * 获取产品组装明细详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取产品组装明细详情失败")
    @ApiOperation(value = "产品组装明细详情", notes = "按ID获取产品组装明细详情")
    @GetMapping(value = "/basicdata/productzuzhuang/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfProductzuzhuangService.selectCmfProductzuzhuangById(id), HttpStatus.OK);
    }

    /**
     * 获取产品组装明细列表
     * uniapp端调用
     *
     * @param cmfProductzuzhuang
     * @return
     */
    @ApiResponse(code = 400, message = "获取产品组装明细列表失败")
    @ApiOperation(value = "产品组装明细列表", notes = "获取产品组装明细列表")
    @GetMapping(value = "/basicdata/productzuzhuang/info/")
    public ResponseEntity<Object> info(CmfProductzuzhuang cmfProductzuzhuang) throws IOException{
        return new ResponseEntity<>(cmfProductzuzhuangService.selectCmfProductzuzhuangList(cmfProductzuzhuang), HttpStatus.OK);
    }
}