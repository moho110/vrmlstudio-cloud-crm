package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfBuyplanmainService;
import com.vrcrm.buy.domain.CmfBuyplanmain;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 采购计划接口
 */

@Api(value = "采购计划接口")
@RestController
@RequestMapping("/api")
public class CmfBuyplanmainController {

    @Autowired
    private ICmfBuyplanmainService cmfBuyplanmainService;

    /**
     * 获取采购计划情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取采购计划详情失败")
    @ApiOperation(value = "采购计划详情", notes = "按ID获取采购计划详情")
    @GetMapping(value = "/buy/buyplanmain/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfBuyplanmainService.selectCmfBuyplanmainById(id), HttpStatus.OK);
    }

    /**
     * 获取采购计划列表
     * uniapp端调用
     *
     * @param cmfBuyplanmain
     * @return
     */
    @ApiResponse(code = 400, message = "获取采购计划列表失败")
    @ApiOperation(value = "采购计划列表", notes = "获取采购计划列表")
    @GetMapping(value = "/buy/buyplanmain/info/")
    public ResponseEntity<Object> info(CmfBuyplanmain cmfBuyplanmain) throws IOException{
        return new ResponseEntity<>(cmfBuyplanmainService.selectCmfBuyplanmainList(cmfBuyplanmain), HttpStatus.OK);
    }
}

