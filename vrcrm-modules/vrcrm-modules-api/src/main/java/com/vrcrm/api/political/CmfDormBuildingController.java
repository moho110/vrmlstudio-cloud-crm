package com.vrcrm.api.political;

import com.vrcrm.political.service.ICmfDormBuildingService;
import com.vrcrm.political.domain.CmfDormBuilding;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 帐号操作接口
 */

@Api(value = "帐号操作接口")
@RestController
@RequestMapping("/api")
public class CmfDormBuildingController {

    @Autowired
    private ICmfDormBuildingService cmfDormBuildingService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取帐号操作详情失败")
    @ApiOperation(value = "帐号操作详情", notes = "按ID获取帐号操作详情")
    @GetMapping(value = "/political/dormbuilding/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfDormBuildingService.selectCmfDormBuildingById(id), HttpStatus.OK);
    }

    /**
     * 获取帐号操作列表
     * uniapp端调用
     *
     * @param cmfDormBuilding
     * @return
     */
    @ApiResponse(code = 400, message = "获取帐号操作列表失败")
    @ApiOperation(value = "帐号操作列表", notes = "获取帐号操作列表")
    @GetMapping(value = "/political/dormbuilding/info/")
    public ResponseEntity<Object> info(CmfDormBuilding cmfDormBuilding) throws IOException{
        return new ResponseEntity<>(cmfDormBuildingService.selectCmfDormBuildingList(cmfDormBuilding), HttpStatus.OK);
    }
}