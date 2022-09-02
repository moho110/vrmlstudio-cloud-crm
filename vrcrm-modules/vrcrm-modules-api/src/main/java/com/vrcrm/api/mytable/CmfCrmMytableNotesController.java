package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCrmMytableNoteService;
import com.vrcrm.mytable.domain.CmfCrmMytableNote;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 桌面便签表接口
 */

@Api(value = "桌面便签表接口")
@RestController
@RequestMapping("/api")
public class CmfCrmMytableNotesController {

    @Autowired
    private ICmfCrmMytableNoteService cmfCrmMytableNoteService;

    /**
     * 获取桌面便签表
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取桌面便签表详情失败")
    @ApiOperation(value = "桌面便签表详情", notes = "按ID获取桌面便签表详情")
    @GetMapping(value = "/mytable/mytablenote/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCrmMytableNoteService.selectCmfCrmMytableNoteById(id), HttpStatus.OK);
    }

    /**
     * 获取桌面便签表列表
     * uniapp端调用
     *
     * @param cmfCrmMytableNote
     * @return
     */
    @ApiResponse(code = 400, message = "获取桌面便签表列表失败")
    @ApiOperation(value = "桌面便签表列表", notes = "获取桌面便签表列表")
    @GetMapping(value = "/mytable/mytablenote/info/")
    public ResponseEntity<Object> info(CmfCrmMytableNote cmfCrmMytableNote) throws IOException{
        return new ResponseEntity<>(cmfCrmMytableNoteService.selectCmfCrmMytableNoteList(cmfCrmMytableNote), HttpStatus.OK);
    }
}