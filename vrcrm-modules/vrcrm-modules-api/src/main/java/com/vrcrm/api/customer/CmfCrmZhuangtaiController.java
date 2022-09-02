package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCrmZhuangtaiService;
import com.vrcrm.customer.domain.CmfCrmZhuangtai;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 状态接口
 */

@Api(value = "状态接口")
@RestController
@RequestMapping("/api")
public class CmfCrmZhuangtaiController {

    @Autowired
    private ICmfCrmZhuangtaiService cmfCrmZhuangtaiService;

    /**
     * 获取状态
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取状态详情失败")
    @ApiOperation(value = "状态详情", notes = "按ID获取状态详情")
    @GetMapping(value = "/customer/crmzhuangtai/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmZhuangtaiService.selectCmfCrmZhuangtaiById(id), HttpStatus.OK);
    }

    /**
     * 获取状态列表
     * uniapp端调用
     *
     * @param cmfCrmZhuangtai
     * @return
     */
    @ApiResponse(code = 400, message = "获取状态列表失败")
    @ApiOperation(value = "状态列表", notes = "获取状态列表")
    @GetMapping(value = "/customer/crmzhuangtai/info/")
    public ResponseEntity<Object> info(CmfCrmZhuangtai cmfCrmZhuangtai) throws IOException{
        return new ResponseEntity<>(cmfCrmZhuangtaiService.selectCmfCrmZhuangtaiList(cmfCrmZhuangtai), HttpStatus.OK);
    }
}