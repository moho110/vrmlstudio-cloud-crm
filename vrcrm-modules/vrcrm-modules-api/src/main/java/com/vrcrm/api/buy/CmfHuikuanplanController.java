package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfHuikuanplanService;
import com.vrcrm.buy.domain.CmfHuikuanplan;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 汇款计划接口
 */

@Api(value = "汇款计划接口")
@RestController
@RequestMapping("/api")
public class CmfHuikuanplanController {

    @Autowired
    private ICmfHuikuanplanService cmfHuikuanplanService;

    /**
     * 获取汇款计划详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取汇款计划详情失败")
    @ApiOperation(value = "汇款计划详情", notes = "按ID获取汇款计划详情")
    @GetMapping(value = "/buy/huikuanplan/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHuikuanplanService.selectCmfHuikuanplanById(id), HttpStatus.OK);
    }

    /**
     * 获取汇款计划列表
     * uniapp端调用
     *
     * @param cmfHuikuanplan
     * @return
     */
    @ApiResponse(code = 400, message = "获取汇款计划列表失败")
    @ApiOperation(value = "汇款计划列表", notes = "获取汇款计划列表")
    @GetMapping(value = "/buy/huikuanplan/info/")
    public ResponseEntity<Object> info(CmfHuikuanplan cmfHuikuanplan) throws IOException{
        return new ResponseEntity<>(cmfHuikuanplanService.selectCmfHuikuanplanList(cmfHuikuanplan), HttpStatus.OK);
    }
}