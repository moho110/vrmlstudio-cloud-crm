package com.vrcrm.api.buy;

import com.vrcrm.buy.service.ICmfIfneedService;
import com.vrcrm.buy.domain.CmfIfneed;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 是否需求接口
 */

@Api(value = "是否需求接口")
@RestController
@RequestMapping("/api")
public class CmfIfneedController {

    @Autowired
    private ICmfIfneedService cmfIfneedService;

    /**
     * 获取是否需求详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取帐号操作详情失败")
    @ApiOperation(value = "是否需求详情", notes = "按ID获取是否需求详情")
    @GetMapping(value = "/buy/cmfIfneed/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfIfneedService.selectCmfIfneedById(id), HttpStatus.OK);
    }

    /**
     * 获取是否需求列表
     * uniapp端调用
     *
     * @param cmfIfneed
     * @return
     */
    @ApiResponse(code = 400, message = "获取是否需求列表失败")
    @ApiOperation(value = "是否需求列表", notes = "获取是否需求列表")
    @GetMapping(value = "/buy/cmfIfneed/info/")
    public ResponseEntity<Object> info(CmfIfneed cmfIfneed) throws IOException{
        return new ResponseEntity<>(cmfIfneedService.selectCmfIfneedList(cmfIfneed), HttpStatus.OK);
    }
}