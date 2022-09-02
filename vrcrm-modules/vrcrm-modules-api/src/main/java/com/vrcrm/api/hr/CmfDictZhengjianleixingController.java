package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfDictZhengjianleixingService;
import com.vrcrm.hr.domain.CmfDictZhengjianleixing;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 证件类型接口
 */

@Api(value = "证件类型接口")
@RestController
@RequestMapping("/api")
public class CmfDictZhengjianleixingController {

    @Autowired
    private ICmfDictZhengjianleixingService cmfDictZhengjianleixingService;

    /**
     * 获取证件类型详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取证件类型详情失败")
    @ApiOperation(value = "证件类型详情", notes = "按ID获取证件类型详情")
    @GetMapping(value = "/hr/zhengjianleixing/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDictZhengjianleixingService.selectCmfDictZhengjianleixingById(id), HttpStatus.OK);
    }

    /**
     * 获取证件类型列表
     * uniapp端调用
     *
     * @param cmfDictZhengjianleixing
     * @return
     */
    @ApiResponse(code = 400, message = "获取证件类型列表失败")
    @ApiOperation(value = "证件类型列表", notes = "获取证件类型列表")
    @GetMapping(value = "/hr/zhengjianleixing/info/")
    public ResponseEntity<Object> info(CmfDictZhengjianleixing cmfDictZhengjianleixing) throws IOException{
        return new ResponseEntity<>(cmfDictZhengjianleixingService.selectCmfDictZhengjianleixingList(cmfDictZhengjianleixing), HttpStatus.OK);
    }
}