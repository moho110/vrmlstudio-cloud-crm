package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfBuyplanstateService;
import com.vrcrm.buy.domain.CmfBuyplanstate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 采购计划状态接口
 */

@Api(value = "采购计划状态接口")
@RestController
@RequestMapping("/api")
public class CmfBuyplanstateController {

    @Autowired
    private ICmfBuyplanstateService cmfBuyplanstateService;

    /**
     * 获取采购计划状态详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取采购计划状态详情失败")
    @ApiOperation(value = "采购计划状态详情", notes = "按ID获取采购计划状态详情")
    @GetMapping(value = "/buy/buyplanstate/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfBuyplanstateService.selectCmfBuyplanstateById(id), HttpStatus.OK);
    }

    /**
     * 获取采购计划状态列表
     * uniapp端调用
     *
     * @param cmfBuyplanstate
     * @return
     */
    @ApiResponse(code = 400, message = "获取采购计划状态列表失败")
    @ApiOperation(value = "采购计划状态列表", notes = "获取采购计划状态列表")
    @GetMapping(value = "/buy/buyplanstate/info/")
    public ResponseEntity<Object> info(CmfBuyplanstate cmfBuyplanstate) throws IOException{
        return new ResponseEntity<>(cmfBuyplanstateService.selectCmfBuyplanstateList(cmfBuyplanstate), HttpStatus.OK);
    }
}