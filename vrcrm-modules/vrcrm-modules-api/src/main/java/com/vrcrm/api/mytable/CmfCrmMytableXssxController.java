package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCrmMytableXssxService;
import com.vrcrm.mytable.domain.CmfCrmMytableXssx;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 显示属性接口
 */

@Api(value = "显示属性接口")
@RestController
@RequestMapping("/api")
public class CmfCrmMytableXssxController {

    @Autowired
    private ICmfCrmMytableXssxService cmfCrmMytableXssxService;

    /**
     * 获取显示属性
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取显示属性详情失败")
    @ApiOperation(value = "显示属性详情", notes = "按ID获取显示属性详情")
    @GetMapping(value = "/mytable/mytablexssx/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmMytableXssxService.selectCmfCrmMytableXssxById(id), HttpStatus.OK);
    }

    /**
     * 获取显示属性列表
     * uniapp端调用
     *
     * @param cmfCrmMytableXssx
     * @return
     */
    @ApiResponse(code = 400, message = "获取显示属性列表失败")
    @ApiOperation(value = "显示属性列表", notes = "获取显示属性列表")
    @GetMapping(value = "/mytable/mytablexssx/info/")
    public ResponseEntity<Object> info(CmfCrmMytableXssx cmfCrmMytableXssx) throws IOException{
        return new ResponseEntity<>(cmfCrmMytableXssxService.selectCmfCrmMytableXssxList(cmfCrmMytableXssx), HttpStatus.OK);
    }
}