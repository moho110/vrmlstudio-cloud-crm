package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfImportantService;
import com.vrcrm.buy.domain.CmfImportant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 重要性接口
 */

@Api(value = "重要性接口")
@RestController
@RequestMapping("/api")
public class CmfImportantController {

    @Autowired
    private ICmfImportantService cmfImportantService;

    /**
     * 获取重要性详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取重要性详情失败")
    @ApiOperation(value = "重要性详情", notes = "按ID获取重要性详情")
    @GetMapping(value = "/buy/cmfimportant/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfImportantService.selectCmfImportantById(id), HttpStatus.OK);
    }

    /**
     * 获取重要性列表
     * uniapp端调用
     *
     * @param cmfImportant
     * @return
     */
    @ApiResponse(code = 400, message = "获取重要性列表失败")
    @ApiOperation(value = "重要性列表", notes = "获取重要性列表")
    @GetMapping(value = "/buy/cmfimportant/info/")
    public ResponseEntity<Object> info(CmfImportant cmfImportant) throws IOException{
        return new ResponseEntity<>(cmfImportantService.selectCmfImportantList(cmfImportant), HttpStatus.OK);
    }
}