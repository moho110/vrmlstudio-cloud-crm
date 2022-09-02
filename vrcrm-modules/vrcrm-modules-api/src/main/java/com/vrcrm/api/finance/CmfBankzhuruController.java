package com.vrcrm.api.finance;

import com.vrcrm.finance.service.ICmfBankzhuruService;
import com.vrcrm.finance.domain.CmfBankzhuru;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 帐户注入接口
 */

@Api(value = "帐户注入接口")
@RestController
@RequestMapping("/api")
public class CmfBankzhuruController {

    @Autowired
    private ICmfBankzhuruService cmfBankzhuruService;

    /**
     * 获取帐户注入情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取帐户注入详情失败")
    @ApiOperation(value = "帐户注入详情", notes = "按ID获取帐户注入详情")
    @GetMapping(value = "/finance/bankzhuru/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfBankzhuruService.selectCmfBankzhuruById(id), HttpStatus.OK);
    }

    /**
     * 获取帐户注入列表
     * uniapp端调用
     *
     * @param cmfBankzhuru
     * @return
     */
    @ApiResponse(code = 400, message = "获取帐户注入列表失败")
    @ApiOperation(value = "帐户注入列表", notes = "获取帐户注入列表")
    @GetMapping(value = "/finance/bankzhuru/info/")
    public ResponseEntity<Object> info(CmfBankzhuru cmfBankzhuru) throws IOException{
        return new ResponseEntity<>(cmfBankzhuruService.selectCmfBankzhuruList(cmfBankzhuru), HttpStatus.OK);
    }
}

