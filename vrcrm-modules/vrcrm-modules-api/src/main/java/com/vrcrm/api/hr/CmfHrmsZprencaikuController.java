package com.vrcrm.api.hr;

import com.vrcrm.hr.service.ICmfHrmsZprencaikuService;
import com.vrcrm.hr.domain.CmfHrmsZprencaiku;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 招聘人才库接口
 */

@Api(value = "招聘人才库接口")
@RestController
@RequestMapping("/api")
public class CmfHrmsZprencaikuController {

    @Autowired
    private ICmfHrmsZprencaikuService cmfHrmsZprencaikuService;

    /**
     * 获取招聘人才库详情
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取招聘人才库详情失败")
    @ApiOperation(value = "招聘人才库详情", notes = "按ID获取招聘人才库详情")
    @GetMapping(value = "/hr/zprencaiku/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfHrmsZprencaikuService.selectCmfHrmsZprencaikuById(id), HttpStatus.OK);
    }

    /**
     * 获取招聘人才库列表
     * uniapp端调用
     *
     * @param cmfHrmsZprencaiku
     * @return
     */
    @ApiResponse(code = 400, message = "获取招聘人才库列表失败")
    @ApiOperation(value = "招聘人才库列表", notes = "获取招聘人才库列表")
    @GetMapping(value = "/hr/zprencaiku/info/")
    public ResponseEntity<Object> info(CmfHrmsZprencaiku cmfHrmsZprencaiku) throws IOException{
        return new ResponseEntity<>(cmfHrmsZprencaikuService.selectCmfHrmsZprencaikuList(cmfHrmsZprencaiku), HttpStatus.OK);
    }
}