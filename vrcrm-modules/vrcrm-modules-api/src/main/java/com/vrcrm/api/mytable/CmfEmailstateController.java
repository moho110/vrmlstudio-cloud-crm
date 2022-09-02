package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfEmailstateService;
import com.vrcrm.mytable.domain.CmfEmailstate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 邮件状态接口
 */

@Api(value = "邮件状态接口")
@RestController
@RequestMapping("/api")
public class CmfEmailstateController {

    @Autowired
    private ICmfEmailstateService cmfEmailstateService;

    /**
     * 获取邮件状态
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取邮件状态详情失败")
    @ApiOperation(value = "邮件状态详情", notes = "按ID获取邮件状态详情")
    @GetMapping(value = "/mytable/emailstate/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfEmailstateService.selectCmfEmailstateById(id), HttpStatus.OK);
    }

    /**
     * 获取邮件状态列表
     * uniapp端调用
     *
     * @param cmfEmailstate
     * @return
     */
    @ApiResponse(code = 400, message = "获取邮件状态列表失败")
    @ApiOperation(value = "邮件状态列表", notes = "获取邮件状态列表")
    @GetMapping(value = "/mytable/emailstate/info/")
    public ResponseEntity<Object> info(CmfEmailstate cmfEmailstate) throws IOException{
        return new ResponseEntity<>(cmfEmailstateService.selectCmfEmailstateList(cmfEmailstate), HttpStatus.OK);
    }
}