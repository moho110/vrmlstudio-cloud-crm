package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfPropertyService;
import com.vrcrm.basicdata.domain.CmfProperty;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 行业归属接口
 */

@Api(value = "行业归属接口")
@RestController
@RequestMapping("/api")
public class CmfPropertyController {

    @Autowired
    private ICmfPropertyService cmfPropertyService;

    /**
     * 获取行业归属详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取行业归属详情失败")
    @ApiOperation(value = "行业归属详情", notes = "按ID获取行业归属详情")
    @GetMapping(value = "/basicdata/property/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfPropertyService.selectCmfPropertyById(id), HttpStatus.OK);
    }

    /**
     * 获取行业归属列表
     * uniapp端调用
     *
     * @param cmfProperty
     * @return
     */
    @ApiResponse(code = 400, message = "获取行业归属列表失败")
    @ApiOperation(value = "行业归属列表", notes = "获取行业归属列表")
    @GetMapping(value = "/basicdata/property/info/")
    public ResponseEntity<Object> info(CmfProperty cmfProperty) throws IOException{
        return new ResponseEntity<>(cmfPropertyService.selectCmfPropertyList(cmfProperty), HttpStatus.OK);
    }
}