package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfCrmFeiyongSqService;
import com.vrcrm.buy.domain.CmfCrmFeiyongSq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 费用申请接口
 */

@Api(value = "费用申请接口")
@RestController
@RequestMapping("/api")
public class CmfCrmFeiyongSqController {

    @Autowired
    private ICmfCrmFeiyongSqService cmfCrmFeiyongSqService;

    /**
     * 获取费用申请详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取费用申请详情失败")
    @ApiOperation(value = "费用申请详情", notes = "按ID获取费用申请详情")
    @GetMapping(value = "/buy/crmFeiyongsq/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmFeiyongSqService.selectCmfCrmFeiyongSqById(id), HttpStatus.OK);
    }

    /**
     * 获取费用申请列表
     * uniapp端调用
     *
     * @param cmfCrmFeiyongSq
     * @return
     */
    @ApiResponse(code = 400, message = "获取费用申请列表失败")
    @ApiOperation(value = "费用申请列表", notes = "获取费用申请列表")
    @GetMapping(value = "/buy/crmFeiyongsq/info/")
    public ResponseEntity<Object> info(CmfCrmFeiyongSq cmfCrmFeiyongSq) throws IOException{
        return new ResponseEntity<>(cmfCrmFeiyongSqService.selectCmfCrmFeiyongSqList(cmfCrmFeiyongSq), HttpStatus.OK);
    }
}