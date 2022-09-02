package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfEduXingzhengBanciService;
import com.vrcrm.hr.domain.CmfEduXingzhengBanci;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行政班次接口
 */

@Api(value = "行政班次接口")
@RestController
@RequestMapping("/api")
public class CmfEduXingzhengBanciController {

    @Autowired
    private ICmfEduXingzhengBanciService cmfEduXingzhengBanciService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行政班次详情失败")
    @ApiOperation(value = "行政班次详情", notes = "按ID获取行政班次详情")
    @GetMapping(value = "/hr/eduxingzhengbanci/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEduXingzhengBanciService.selectCmfEduXingzhengBanciById(id), HttpStatus.OK);
    }

    /**
     * 获取行政班次列表
     * uniapp端调用
     *
     * @param cmfEduXingzhengBanci
     * @return
     */
    @ApiResponse(code = 400, message = "获取行政班次列表失败")
    @ApiOperation(value = "行政班次列表", notes = "获取行政班次列表")
    @GetMapping(value = "/hr/eduxingzhengbanci/info/")
    public ResponseEntity<Object> info(CmfEduXingzhengBanci cmfEduXingzhengBanci) throws IOException{
        return new ResponseEntity<>(cmfEduXingzhengBanciService.selectCmfEduXingzhengBanciList(cmfEduXingzhengBanci), HttpStatus.OK);
    }
}