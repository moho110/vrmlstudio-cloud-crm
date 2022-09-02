package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsFileLuyongService;
import com.vrcrm.hr.domain.CmfHrmsFileLuyong;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 人员录用接口
 */

@Api(value = "人员录用接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsFileLuyongController {

    @Autowired
    private ICmfHrmsFileLuyongService cmfHrmsFileLuyongService;

    /**
     * 获取固定资产情详
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取人员录用详情失败")
    @ApiOperation(value = "人员录用详情", notes = "按ID获取人员录用详情")
    @GetMapping(value = "/hr/fileluyong/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsFileLuyongService.selectCmfHrmsFileLuyongById(id), HttpStatus.OK);
    }

    /**
     * 获取人员录用列表
     * uniapp端调用
     *
     * @param cmfHrmsFileLuyong
     * @return
     */
    @ApiResponse(code = 400, message = "获取人员录用列表失败")
    @ApiOperation(value = "人员录用列表", notes = "获取人员录用列表")
    @GetMapping(value = "/hr/fileluyong/info/")
    public ResponseEntity<Object> info(CmfHrmsFileLuyong cmfHrmsFileLuyong) throws IOException{
        return new ResponseEntity<>(cmfHrmsFileLuyongService.selectCmfHrmsFileLuyongList(cmfHrmsFileLuyong), HttpStatus.OK);
    }
}