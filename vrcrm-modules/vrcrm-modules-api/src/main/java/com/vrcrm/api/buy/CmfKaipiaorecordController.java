package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfKaipiaorecordService;
import com.vrcrm.buy.domain.CmfKaipiaorecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 开票记录接口
 */

@Api(value = "开票记录接口")
@RestController
@RequestMapping("/api")
public class CmfKaipiaorecordController {

    @Autowired
    private ICmfKaipiaorecordService cmfKaipiaorecordService;

    /**
     * 获取开票记录详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取开票记录详情失败")
    @ApiOperation(value = "开票记录详情", notes = "按ID获取开票记录详情")
    @GetMapping(value = "/buy/cmfkaipiaorecord/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfKaipiaorecordService.selectCmfKaipiaorecordById(id), HttpStatus.OK);
    }

    /**
     * 获取开票记录列表
     * uniapp端调用
     *
     * @param cmfKaipiaorecord
     * @return
     */
    @ApiResponse(code = 400, message = "获取帐号操作列表失败")
    @ApiOperation(value = "帐号操作列表", notes = "获取帐号操作列表")
    @GetMapping(value = "/buy/cmfkaipiaorecord/info/")
    public ResponseEntity<Object> info(CmfKaipiaorecord cmfKaipiaorecord) throws IOException{
        return new ResponseEntity<>(cmfKaipiaorecordService.selectCmfKaipiaorecordList(cmfKaipiaorecord), HttpStatus.OK);
    }
}