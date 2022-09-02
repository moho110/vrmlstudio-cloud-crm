package com.vrcrm.api.customer;

import com.vrcrm.customer.service.ICmfCrmShenqingbaobeiService;
import com.vrcrm.customer.domain.CmfCrmShenqingbaobei;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 申请报备接口
 */

@Api(value = "申请报备接口")
@RestController
@RequestMapping("/api")
public class CmfCrmShenqingbaobeiController {

    @Autowired
    private ICmfCrmShenqingbaobeiService cmfCrmShenqingbaobeiService;

    /**
     * 获取申请报备详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取申请报备详情失败")
    @ApiOperation(value = "申请报备详情", notes = "按ID获取申请报备详情")
    @GetMapping(value = "/customer/crmshenqingbaobei/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmShenqingbaobeiService.selectCmfCrmShenqingbaobeiById(id), HttpStatus.OK);
    }

    /**
     * 获取申请报备列表
     * uniapp端调用
     *
     * @param cmfCrmShenqingbaobei
     * @return
     */
    @ApiResponse(code = 400, message = "获取申请报备列表失败")
    @ApiOperation(value = "申请报备列表", notes = "获取申请报备列表")
    @GetMapping(value = "/customer/crmshenqingbaobei/info/")
    public ResponseEntity<Object> info(CmfCrmShenqingbaobei cmfCrmShenqingbaobei) throws IOException{
        return new ResponseEntity<>(cmfCrmShenqingbaobeiService.selectCmfCrmShenqingbaobeiList(cmfCrmShenqingbaobei), HttpStatus.OK);
    }
}