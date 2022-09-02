package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCalltypeService;
import com.vrcrm.mytable.domain.CmfCalltype;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 来电类型接口
 */

@Api(value = "来电类型接口")
@RestController
@RequestMapping("/api")
public class CmfCalltypeController {

    @Autowired
    private ICmfCalltypeService cmfCalltypeService;

    /**
     * 获取来电类型
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取来电类型详情失败")
    @ApiOperation(value = "来电类型详情", notes = "按ID获取来电类型详情")
    @GetMapping(value = "/mytable/calltype/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCalltypeService.selectCmfCalltypeById(id), HttpStatus.OK);
    }

    /**
     * 获取来电类型列表
     * uniapp端调用
     *
     * @param cmfCalltype
     * @return
     */
    @ApiResponse(code = 400, message = "获取来电类型列表失败")
    @ApiOperation(value = "来电类型列表", notes = "获取来电类型列表")
    @GetMapping(value = "/mytable/calltype/info/")
    public ResponseEntity<Object> info(CmfCalltype cmfCalltype) throws IOException{
        return new ResponseEntity<>(cmfCalltypeService.selectCmfCalltypeList(cmfCalltype), HttpStatus.OK);
    }
}