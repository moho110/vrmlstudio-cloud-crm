package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfModifyrecordService;
import com.vrcrm.basicdata.domain.CmfModifyrecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 修改记录接口
 */

@Api(value = "修改记录接口")
@RestController
@RequestMapping("/api")
public class CmfModifyrecordController {

    @Autowired
    private ICmfModifyrecordService cmfModifyrecordService;

    /**
     * 获取修改记录详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取修改记录详情失败")
    @ApiOperation(value = "修改记录详情", notes = "按ID获取修改记录详情")
    @GetMapping(value = "/basicdata/modifyrecord/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfModifyrecordService.selectCmfModifyrecordById(id), HttpStatus.OK);
    }

    /**
     * 获取修改记录列表
     * uniapp端调用
     *
     * @param cmfModifyrecord
     * @return
     */
    @ApiResponse(code = 400, message = "获取修改记录列表失败")
    @ApiOperation(value = "修改记录列表", notes = "获取修改记录列表")
    @GetMapping(value = "/basicdata/modifyrecord/info/")
    public ResponseEntity<Object> info(CmfModifyrecord cmfModifyrecord) throws IOException{
        return new ResponseEntity<>(cmfModifyrecordService.selectCmfModifyrecordList(cmfModifyrecord), HttpStatus.OK);
    }
}