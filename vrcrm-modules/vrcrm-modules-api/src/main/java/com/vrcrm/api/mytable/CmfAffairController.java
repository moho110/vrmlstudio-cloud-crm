package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfAffairService;
import com.vrcrm.mytable.domain.CmfAffair;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 事务接口
 */

@Api(value = "事务接口")
@RestController
@RequestMapping("/api")
public class CmfAffairController {

    @Autowired
    private ICmfAffairService cmfAffairService;

    /**
     * 获取事务详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取事务详情失败")
    @ApiOperation(value = "事务详情", notes = "按ID获取事务详情")
    @GetMapping(value = "/mytable/affair/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfAffairService.selectCmfAffairById(id), HttpStatus.OK);
    }

    /**
     * 获取事务列表
     * uniapp端调用
     *
     * @param cmfAffair
     * @return
     */
    @ApiResponse(code = 400, message = "获取事务列表失败")
    @ApiOperation(value = "事务列表", notes = "获取事务列表")
    @GetMapping(value = "/mytable/affair/info/")
    public ResponseEntity<Object> info(CmfAffair cmfAffair) throws IOException{
        return new ResponseEntity<>(cmfAffairService.selectCmfAffairList(cmfAffair), HttpStatus.OK);
    }
}