package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCrmMytableService;
import com.vrcrm.mytable.domain.CmfCrmMytable;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 我的桌面接口
 */

@Api(value = "我的桌面接口")
@RestController
@RequestMapping("/api")
public class CmfCrmMytableController {

    @Autowired
    private ICmfCrmMytableService cmfCrmMytableService;

    /**
     * 获取我的桌面
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取我的桌面详情失败")
    @ApiOperation(value = "我的桌面详情", notes = "按ID获取我的桌面详情")
    @GetMapping(value = "/mytable/crmmytable/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Long id) throws IOException {
        return new ResponseEntity<>(cmfCrmMytableService.selectCmfCrmMytableById(id), HttpStatus.OK);
    }

    /**
     * 获取我的桌面列表
     * uniapp端调用
     *
     * @param cmfCrmMytable
     * @return
     */
    @ApiResponse(code = 400, message = "获取我的桌面列表失败")
    @ApiOperation(value = "我的桌面列表", notes = "获取我的桌面列表")
    @GetMapping(value = "/mytable/crmmytable/info/")
    public ResponseEntity<Object> info(CmfCrmMytable cmfCrmMytable) throws IOException{
        return new ResponseEntity<>(cmfCrmMytableService.selectCmfCrmMytableList(cmfCrmMytable), HttpStatus.OK);
    }
}