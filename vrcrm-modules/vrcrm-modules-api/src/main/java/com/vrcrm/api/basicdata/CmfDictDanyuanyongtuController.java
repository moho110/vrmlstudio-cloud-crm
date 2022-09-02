package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfDictDanyuanyongtuService;
import com.vrcrm.basicdata.domain.CmfDictDanyuanyongtu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 单元用途接口
 */

@Api(value = "单元用途接口")
@RestController
@RequestMapping("/api")
public class CmfDictDanyuanyongtuController {

    @Autowired
    private ICmfDictDanyuanyongtuService cmfDictDanyuanyongtuService;

    /**
     * 获取单元用途详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取单元用途详情失败")
    @ApiOperation(value = "单元用途详情", notes = "按ID获取单元用途详情")
    @GetMapping(value = "/basicdata/danyuanyongtu/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDictDanyuanyongtuService.selectCmfDictDanyuanyongtuById(id), HttpStatus.OK);
    }

    /**
     * 获取单元用途列表
     * uniapp端调用
     *
     * @param cmfDictDanyuanyongtu
     * @return
     */
    @ApiResponse(code = 400, message = "获取单元用途列表失败")
    @ApiOperation(value = "单元用途列表", notes = "获取单元用途列表")
    @GetMapping(value = "/basicdata/danyuanyongtu/info/")
    public ResponseEntity<Object> info(CmfDictDanyuanyongtu cmfDictDanyuanyongtu) throws IOException{
        return new ResponseEntity<>(cmfDictDanyuanyongtuService.selectCmfDictDanyuanyongtuList(cmfDictDanyuanyongtu), HttpStatus.OK);
    }
}