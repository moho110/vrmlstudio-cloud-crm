package com.vrcrm.api.political;

import com.vrcrm.political.service.ICmfOfficeproductoutService;
import com.vrcrm.political.domain.CmfOfficeproductout;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 帐号操作接口
 */

@Api(value = "帐号操作接口")
@RestController
@RequestMapping("/api")
public class CmfOfficeproductoutController {

    @Autowired
    private ICmfOfficeproductoutService cmfOfficeproductoutService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取帐号操作详情失败")
    @ApiOperation(value = "帐号操作详情", notes = "按ID获取帐号操作详情")
    @GetMapping(value = "/political/officeproductout/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfOfficeproductoutService.selectCmfOfficeproductoutById(id), HttpStatus.OK);
    }

    /**
     * 获取帐号操作列表
     * uniapp端调用
     *
     * @param cmfOfficeproductout
     * @return
     */
    @ApiResponse(code = 400, message = "获取帐号操作列表失败")
    @ApiOperation(value = "帐号操作列表", notes = "获取帐号操作列表")
    @GetMapping(value = "/political/officeproductout/info/")
    public ResponseEntity<Object> info(CmfOfficeproductout cmfOfficeproductout) throws IOException{
        return new ResponseEntity<>(cmfOfficeproductoutService.selectCmfOfficeproductoutList(cmfOfficeproductout), HttpStatus.OK);
    }
}