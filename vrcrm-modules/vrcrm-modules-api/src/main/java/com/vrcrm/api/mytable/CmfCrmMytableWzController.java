package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCrmMytableWzService;
import com.vrcrm.mytable.domain.CmfCrmMytableWz;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 桌面显示位置表接口
 */

@Api(value = "桌面显示位置表接口")
@RestController
@RequestMapping("/api")
public class CmfCrmMytableWzController {

    @Autowired
    private ICmfCrmMytableWzService cmfCrmMytableWzService;

    /**
     * 获取桌面显示位置表
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取桌面显示位置表详情失败")
    @ApiOperation(value = "桌面显示位置表详情", notes = "按ID获取桌面显示位置表详情")
    @GetMapping(value = "/mytable/mytablewz/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmMytableWzService.selectCmfCrmMytableWzById(id), HttpStatus.OK);
    }

    /**
     * 获取桌面显示位置表列表
     * uniapp端调用
     *
     * @param cmfCrmMytableWz
     * @return
     */
    @ApiResponse(code = 400, message = "获取桌面显示位置表列表失败")
    @ApiOperation(value = "桌面显示位置表列表", notes = "获取桌面显示位置表列表")
    @GetMapping(value = "/mytable/mytablewz/info/")
    public ResponseEntity<Object> info(CmfCrmMytableWz cmfCrmMytableWz) throws IOException{
        return new ResponseEntity<>(cmfCrmMytableWzService.selectCmfCrmMytableWzList(cmfCrmMytableWz), HttpStatus.OK);
    }
}