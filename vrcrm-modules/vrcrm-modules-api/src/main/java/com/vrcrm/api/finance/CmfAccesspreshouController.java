package com.vrcrm.api.finance;

import com.vrcrm.finance.service.ICmfAccesspreshouService;
import com.vrcrm.finance.domain.CmfAccesspreshou;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 预收款记录接口
 */

@Api(value = "预收款记录接口")
@RestController
@RequestMapping("/api")
public class CmfAccesspreshouController {

    @Autowired
    private ICmfAccesspreshouService cmfAccesspreshouService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取预收款记录详情失败")
    @ApiOperation(value = "预收款记录详情", notes = "按ID获取预收款记录详情")
    @GetMapping(value = "/finance/accesspreshou/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfAccesspreshouService.selectCmfAccesspreshouById(id), HttpStatus.OK);
    }

    /**
     * 获取帐号操作列表
     * uniapp端调用
     *
     * @param cmfAccesspreshou
     * @return
     */
    @ApiResponse(code = 400, message = "获取预收款记录列表失败")
    @ApiOperation(value = "预收款记录列表", notes = "获取预收款记录列表")
    @GetMapping(value = "/finance/accesspreshou/info/")
    public ResponseEntity<Object> info(CmfAccesspreshou cmfAccesspreshou) throws IOException{
        return new ResponseEntity<>(cmfAccesspreshouService.selectCmfAccesspreshouList(cmfAccesspreshou), HttpStatus.OK);
    }
}

