package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfCertificateService;
import com.vrcrm.basicdata.domain.CmfCertificate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 认证接口
 */

@Api(value = "认证接口")
@RestController
@RequestMapping("/api")
public class CmfCertificateController {

    @Autowired
    private ICmfCertificateService cmfCertificateService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取认证详情失败")
    @ApiOperation(value = "认证详情", notes = "按ID获取认证详情")
    @GetMapping(value = "/basicdata/certificate/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCertificateService.selectCmfCertificateById(id), HttpStatus.OK);
    }

    /**
     * 获取认证列表
     * uniapp端调用
     *
     * @param cmfCertificate
     * @return
     */
    @ApiResponse(code = 400, message = "获取认证列表失败")
    @ApiOperation(value = "认证列表", notes = "获取认证列表")
    @GetMapping(value = "/basicdata/certificate/info/")
    public ResponseEntity<Object> info(CmfCertificate cmfCertificate) throws IOException{
        return new ResponseEntity<>(cmfCertificateService.selectCmfCertificateList(cmfCertificate), HttpStatus.OK);
    }
}