package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfProductzuzhuangDetailService;
import com.vrcrm.basicdata.domain.CmfProductzuzhuangDetail;
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
public class CmfProductzuzhuangDetailController {

    @Autowired
    private ICmfProductzuzhuangDetailService cmfProductzuzhuangDetailService;

    /**
     * 获取产品组装明细详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取产品组装明细详情失败")
    @ApiOperation(value = "产品组装明细详情", notes = "按ID获取产品组装明细详情")
    @GetMapping(value = "/basicdata/zuzhuangdetail/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfProductzuzhuangDetailService.selectCmfProductzuzhuangDetailById(id), HttpStatus.OK);
    }

    /**
     * 获取产品组装明细列表
     * uniapp端调用
     *
     * @param cmfProductzuzhuangDetail
     * @return
     */
    @ApiResponse(code = 400, message = "获取产品组装明细列表失败")
    @ApiOperation(value = "产品组装明细列表", notes = "获取产品组装明细列表")
    @GetMapping(value = "/basicdata/zuzhuangdetail/info/")
    public ResponseEntity<Object> info(CmfProductzuzhuangDetail cmfProductzuzhuangDetail) throws IOException{
        return new ResponseEntity<>(cmfProductzuzhuangDetailService.selectCmfProductzuzhuangDetailList(cmfProductzuzhuangDetail), HttpStatus.OK);
    }
}