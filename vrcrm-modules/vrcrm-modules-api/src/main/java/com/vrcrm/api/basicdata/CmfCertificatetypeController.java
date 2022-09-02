package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfCertificatetypeService;
import com.vrcrm.basicdata.domain.CmfCertificatetype;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 认证类型接口
 */

@Api(value = "认证类型接口")
@RestController
@RequestMapping("/api")
public class CmfCertificatetypeController {

    @Autowired
    private ICmfCertificatetypeService cmfCertificatetypeService;

    /**
     * 获取认证类型详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取认证类型详情失败")
    @ApiOperation(value = "认证类型详情", notes = "按ID获取认证类型详情")
    @GetMapping(value = "/basicdata/certificatetype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCertificatetypeService.selectCmfCertificatetypeById(id), HttpStatus.OK);
    }

    /**
     * 获取认证类型列表
     * uniapp端调用
     *
     * @param cmfCertificatetype
     * @return
     */
    @ApiResponse(code = 400, message = "获取认证类型列表失败")
    @ApiOperation(value = "认证类型列表", notes = "获取认证类型列表")
    @GetMapping(value = "/basicdata/certificatetype/info/")
    public ResponseEntity<Object> info(CmfCertificatetype cmfCertificatetype) throws IOException{
        return new ResponseEntity<>(cmfCertificatetypeService.selectCmfCertificatetypeList(cmfCertificatetype), HttpStatus.OK);
    }
}