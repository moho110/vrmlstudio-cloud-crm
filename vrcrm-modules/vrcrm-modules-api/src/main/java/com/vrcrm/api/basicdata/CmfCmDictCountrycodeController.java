package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfCmdictCountrycodeService;
import com.vrcrm.basicdata.domain.CmfCmdictCountrycode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 国家代码接口
 */

@Api(value = "国家代码接口")
@RestController
@RequestMapping("/api")
public class CmfCmDictCountrycodeController {

    @Autowired
    private ICmfCmdictCountrycodeService cmfCmDictCountrycodeService;

    /**
     * 获取国家代码详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取国家代码详情失败")
    @ApiOperation(value = "国家代码详情", notes = "按ID获取国家代码详情")
    @GetMapping(value = "/basicdata/cmdictcountrycode/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCmDictCountrycodeService.selectCmfCmdictCountrycodeById(id), HttpStatus.OK);
    }

    /**
     * 获取国家代码列表
     * uniapp端调用
     *
     * @param cmfCmDictCountrycode
     * @return
     */
    @ApiResponse(code = 400, message = "获取国家代码列表失败")
    @ApiOperation(value = "国家代码列表", notes = "获取国家代码列表")
    @GetMapping(value = "/basicdata/cmdictcountrycode/info/")
    public ResponseEntity<Object> info(CmfCmdictCountrycode cmfCmDictCountrycode) throws IOException{
        return new ResponseEntity<>(cmfCmDictCountrycodeService.selectCmfCmdictCountrycodeList(cmfCmDictCountrycode), HttpStatus.OK);
    }
}