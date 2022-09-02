package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfHuikuanrecordService;
import com.vrcrm.buy.domain.CmfHuikuanrecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 汇款记录接口
 */

@Api(value = "汇款记录接口")
@RestController
@RequestMapping("/api")
public class CmfHuikuanrecordController {

    @Autowired
    private ICmfHuikuanrecordService cmfHuikuanrecordService;

    /**
     * 获取汇款记录详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取汇款记录详情失败")
    @ApiOperation(value = "汇款记录详情", notes = "按ID获取汇款记录详情")
    @GetMapping(value = "/buy/huikuanrecord/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHuikuanrecordService.selectCmfHuikuanrecordById(id), HttpStatus.OK);
    }

    /**
     * 获取帐汇款记录列表
     * uniapp端调用
     *
     * @param cmfHuikuanrecord
     * @return
     */
    @ApiResponse(code = 400, message = "获取汇款记录列表失败")
    @ApiOperation(value = "汇款记录列表", notes = "获取汇款记录列表")
    @GetMapping(value = "/buy/huikuanrecord/info/")
    public ResponseEntity<Object> info(CmfHuikuanrecord cmfHuikuanrecord) throws IOException{
        return new ResponseEntity<>(cmfHuikuanrecordService.selectCmfHuikuanrecordList(cmfHuikuanrecord), HttpStatus.OK);
    }
}