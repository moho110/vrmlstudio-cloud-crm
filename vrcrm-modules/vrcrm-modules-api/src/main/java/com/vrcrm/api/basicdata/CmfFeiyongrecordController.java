package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfFeiyongrecordService;
import com.vrcrm.basicdata.domain.CmfFeiyongrecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 费用记录接口
 */

@Api(value = "费用记录接口")
@RestController
@RequestMapping("/api")
public class CmfFeiyongrecordController {

    @Autowired
    private ICmfFeiyongrecordService cmfFeiyongrecordService;

    /**
     * 获取费用记录详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取费用记录详情失败")
    @ApiOperation(value = "费用记录详情", notes = "按ID获取费用记录详情")
    @GetMapping(value = "/basicdata/feiyongrecord/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfFeiyongrecordService.selectCmfFeiyongrecordById(id), HttpStatus.OK);
    }

    /**
     * 获取费用记录列表
     * uniapp端调用
     *
     * @param cmfFeiyongrecord
     * @return
     */
    @ApiResponse(code = 400, message = "获取费用记录列表失败")
    @ApiOperation(value = "费用记录列表", notes = "获取费用记录列表")
    @GetMapping(value = "/basicdata/feiyongrecord/info/")
    public ResponseEntity<Object> info(CmfFeiyongrecord cmfFeiyongrecord) throws IOException{
        return new ResponseEntity<>(cmfFeiyongrecordService.selectCmfFeiyongrecordList(cmfFeiyongrecord), HttpStatus.OK);
    }
}