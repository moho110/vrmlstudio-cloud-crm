package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCrmShenhezhuangtaiService;
import com.vrcrm.customer.domain.CmfCrmShenhezhuangtai;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 审核状态接口
 */

@Api(value = "审核状态接口")
@RestController
@RequestMapping("/api")
public class CmfCrmShenhezhuangtaiController {

    @Autowired
    private ICmfCrmShenhezhuangtaiService cmfCrmShenhezhuangtaiService;

    /**
     * 获取审核状态详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取审核状态详情失败")
    @ApiOperation(value = "审核状态详情", notes = "按ID获取审核状态详情")
    @GetMapping(value = "/customer/crmShenhezhuangtai/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmShenhezhuangtaiService.selectCmfCrmShenhezhuangtaiById(id), HttpStatus.OK);
    }

    /**
     * 获取审核状态列表
     * uniapp端调用
     *
     * @param cmfCrmShenhezhuangtai
     * @return
     */
    @ApiResponse(code = 400, message = "获取审核状态列表失败")
    @ApiOperation(value = "审核状态列表", notes = "获取审核状态列表")
    @GetMapping(value = "/customer/crmShenhezhuangtai/info/")
    public ResponseEntity<Object> info(CmfCrmShenhezhuangtai cmfCrmShenhezhuangtai) throws IOException{
        return new ResponseEntity<>(cmfCrmShenhezhuangtaiService.selectCmfCrmShenhezhuangtaiList(cmfCrmShenhezhuangtai), HttpStatus.OK);
    }
}