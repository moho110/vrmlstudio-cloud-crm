package com.vrcrm.api.basicdata;

import com.vrcrm.basicdata.service.ICmfFeiyongclasseService;
import com.vrcrm.basicdata.domain.CmfFeiyongclasse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 费用分类接口
 */

@Api(value = "费用分类接口")
@RestController
@RequestMapping("/api")
public class CmfFeiyongclassController {

    @Autowired
    private ICmfFeiyongclasseService cmfFeiyongclasseService;

    /**
     * 获取费用分类详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取费用分类详情失败")
    @ApiOperation(value = "费用分类详情", notes = "按ID获取费用分类详情")
    @GetMapping(value = "/basicdata/feiyongclasse/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfFeiyongclasseService.selectCmfFeiyongclasseById(id), HttpStatus.OK);
    }

    /**
     * 获取费用分类列表
     * uniapp端调用
     *
     * @param cmfFeiyongclasse
     * @return
     */
    @ApiResponse(code = 400, message = "获取费用分类列表失败")
    @ApiOperation(value = "费用分类列表", notes = "获取费用分类列表")
    @GetMapping(value = "/basicdata/feiyongclasse/info/")
    public ResponseEntity<Object> info(CmfFeiyongclasse cmfFeiyongclasse) throws IOException{
        return new ResponseEntity<>(cmfFeiyongclasseService.selectCmfFeiyongclasseList(cmfFeiyongclasse), HttpStatus.OK);
    }
}