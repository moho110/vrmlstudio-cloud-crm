package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfDictDanyuanzhuangtaiService;
import com.vrcrm.basicdata.domain.CmfDictDanyuanzhuangtai;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 单元状态接口
 */

@Api(value = "单元状态接口")
@RestController
@RequestMapping("/api")
public class CmfDictDanyuanzhuangtaiController {

    @Autowired
    private ICmfDictDanyuanzhuangtaiService cmfDictDanyuanzhuangtaiService;

    /**
     * 获取单元状态详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取单元状态详情失败")
    @ApiOperation(value = "单元状态详情", notes = "按ID获取单元状态详情")
    @GetMapping(value = "/basicdata/danyuanzhuangtai/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDictDanyuanzhuangtaiService.selectCmfDictDanyuanzhuangtaiById(id), HttpStatus.OK);
    }

    /**
     * 获取单元状态列表
     * uniapp端调用
     *
     * @param cmfDictDanyuanzhuangtai
     * @return
     */
    @ApiResponse(code = 400, message = "获取单元状态列表失败")
    @ApiOperation(value = "单元状态列表", notes = "获取单元状态列表")
    @GetMapping(value = "/basicdata/danyuanzhuangtai/info/")
    public ResponseEntity<Object> info(CmfDictDanyuanzhuangtai cmfDictDanyuanzhuangtai) throws IOException{
        return new ResponseEntity<>(cmfDictDanyuanzhuangtaiService.selectCmfDictDanyuanzhuangtaiList(cmfDictDanyuanzhuangtai), HttpStatus.OK);
    }
}