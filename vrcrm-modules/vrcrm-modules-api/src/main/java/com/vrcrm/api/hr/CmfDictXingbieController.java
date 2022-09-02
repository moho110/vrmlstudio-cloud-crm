package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfDictXingbieService;
import com.vrcrm.hr.domain.CmfDictXingbie;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 性别接口
 */

@Api(value = "性别接口")
@RestController
@RequestMapping("/api")
public class CmfDictXingbieController {

    @Autowired
    private ICmfDictXingbieService cmfDictXingbieService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取性别详情失败")
    @ApiOperation(value = "性别详情", notes = "按ID获取性别详情")
    @GetMapping(value = "/hr/cmfdictxingbie/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDictXingbieService.selectCmfDictXingbieById(id), HttpStatus.OK);
    }

    /**
     * 获取性别列表
     * uniapp端调用
     *
     * @param cmfDictXingbie
     * @return
     */
    @ApiResponse(code = 400, message = "获取性别列表失败")
    @ApiOperation(value = "性别列表", notes = "获取性别列表")
    @GetMapping(value = "/hr/cmfdictxingbie/info/")
    public ResponseEntity<Object> info(CmfDictXingbie cmfDictXingbie) throws IOException{
        return new ResponseEntity<>(cmfDictXingbieService.selectCmfDictXingbieList(cmfDictXingbie), HttpStatus.OK);
    }
}