package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfProductzuzhuangstateService;
import com.vrcrm.basicdata.domain.CmfProductzuzhuangstate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 产品组装状态接口
 */

@Api(value = "产品组装状态接口")
@RestController
@RequestMapping("/api")
public class CmfProductzuzhuangstateController {

    @Autowired
    private ICmfProductzuzhuangstateService cmfProductzuzhuangstateService;

    /**
     * 获取产品组装状态详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取产品组装状态详情失败")
    @ApiOperation(value = "产品组装状态详情", notes = "按ID获取产品组装状态详情")
    @GetMapping(value = "/basicdata/zuzhuangstate/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfProductzuzhuangstateService.selectCmfProductzuzhuangstateById(id), HttpStatus.OK);
    }

    /**
     * 获取产品组装状态列表
     * uniapp端调用
     *
     * @param cmfProductzuzhuangstate
     * @return
     */
    @ApiResponse(code = 400, message = "获取产品组装状态列表失败")
    @ApiOperation(value = "产品组装状态列表", notes = "获取产品组装状态列表")
    @GetMapping(value = "/basicdata/zuzhuangstate/info/")
    public ResponseEntity<Object> info(CmfProductzuzhuangstate cmfProductzuzhuangstate) throws IOException{
        return new ResponseEntity<>(cmfProductzuzhuangstateService.selectCmfProductzuzhuangstateList(cmfProductzuzhuangstate), HttpStatus.OK);
    }
}