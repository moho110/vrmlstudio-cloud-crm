package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfLinkmanService;
import com.vrcrm.basicdata.domain.CmfLinkman;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 联系人接口
 */

@Api(value = "联系人接口")
@RestController
@RequestMapping("/api")
public class CmfLinkmanController {

    @Autowired
    private ICmfLinkmanService cmfLinkmanService;

    /**
     * 获取联系人详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取联系人详情失败")
    @ApiOperation(value = "联系人详情", notes = "按ID获取联系人详情")
    @GetMapping(value = "/basicdata/linkman/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfLinkmanService.selectCmfLinkmanById(id), HttpStatus.OK);
    }

    /**
     * 获取联系人列表
     * uniapp端调用
     *
     * @param cmfLinkman
     * @return
     */
    @ApiResponse(code = 400, message = "获取联系人列表失败")
    @ApiOperation(value = "联系人列表", notes = "获取联系人列表")
    @GetMapping(value = "/basicdata/linkman/info/")
    public ResponseEntity<Object> info(CmfLinkman cmfLinkman) throws IOException{
        return new ResponseEntity<>(cmfLinkmanService.selectCmfLinkmanList(cmfLinkman), HttpStatus.OK);
    }
}