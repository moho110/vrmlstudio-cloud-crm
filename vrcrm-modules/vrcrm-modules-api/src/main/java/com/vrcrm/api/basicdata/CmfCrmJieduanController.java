package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfCrmJieduanService;
import com.vrcrm.basicdata.domain.CmfCrmJieduan;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 阶段接口
 */

@Api(value = "阶段接口")
@RestController
@RequestMapping("/api")
public class CmfCrmJieduanController {

    @Autowired
    private ICmfCrmJieduanService cmfCrmJieduanService;

    /**
     * 获取阶段详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取阶段详情失败")
    @ApiOperation(value = "阶段详情", notes = "按ID获取阶段详情")
    @GetMapping(value = "/basicdata/crmjieduan/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmJieduanService.selectCmfCrmJieduanById(id), HttpStatus.OK);
    }

    /**
     * 获取阶段列表
     * uniapp端调用
     *
     * @param cmfCrmJieduan
     * @return
     */
    @ApiResponse(code = 400, message = "获取阶段列表失败")
    @ApiOperation(value = "阶段列表", notes = "获取阶段列表")
    @GetMapping(value = "/basicdata/crmjieduan/info/")
    public ResponseEntity<Object> info(CmfCrmJieduan cmfCrmJieduan) throws IOException{
        return new ResponseEntity<>(cmfCrmJieduanService.selectCmfCrmJieduanList(cmfCrmJieduan), HttpStatus.OK);
    }
}