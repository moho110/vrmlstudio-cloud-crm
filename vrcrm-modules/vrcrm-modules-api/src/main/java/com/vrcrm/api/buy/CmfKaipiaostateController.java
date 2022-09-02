package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfKaipiaostateService;
import com.vrcrm.buy.domain.CmfKaipiaostate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 开票状态接口
 */

@Api(value = "开票状态接口")
@RestController
@RequestMapping("/api")
public class CmfKaipiaostateController {

    @Autowired
    private ICmfKaipiaostateService cmfKaipiaostateService;

    /**
     * 获取开票状态详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取开票状态详情失败")
    @ApiOperation(value = "开票状态详情", notes = "按ID获取开票状态详情")
    @GetMapping(value = "/buy/kaipiaostate/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfKaipiaostateService.selectCmfKaipiaostateById(id), HttpStatus.OK);
    }

    /**
     * 获取开票状态列表
     * uniapp端调用
     *
     * @param cmfKaipiaostate
     * @return
     */
    @ApiResponse(code = 400, message = "获取开票状态列表失败")
    @ApiOperation(value = "开票状态列表", notes = "获取开票状态列表")
    @GetMapping(value = "/buy/kaipiaostate/info/")
    public ResponseEntity<Object> info(CmfKaipiaostate cmfKaipiaostate) throws IOException{
        return new ResponseEntity<>(cmfKaipiaostateService.selectCmfKaipiaostateList(cmfKaipiaostate), HttpStatus.OK);
    }
}