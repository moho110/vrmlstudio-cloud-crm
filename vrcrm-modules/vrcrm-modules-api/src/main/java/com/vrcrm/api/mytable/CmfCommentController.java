package com.vrcrm.api.mytable;

import com.vrcrm.mytable.service.ICmfCommentService;
import com.vrcrm.mytable.domain.CmfComment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 评论表接口
 */

@Api(value = "评论表接口")
@RestController
@RequestMapping("/api")
public class CmfCommentController {

    @Autowired
    private ICmfCommentService cmfCommentService;

    /**
     * 获取评论表
     *
     * @param id
     * @return
     * @throws IOException
     */
    @ApiResponse(code = 400, message = "获取评论表详情失败")
    @ApiOperation(value = "评论表详情", notes = "按ID获取评论表详情")
    @GetMapping(value = "/mytable/comment/find/{id}")
    public ResponseEntity<Object> find(@PathVariable("id") Integer id) throws IOException {
        return new ResponseEntity<>(cmfCommentService.selectCmfCommentById(id), HttpStatus.OK);
    }

    /**
     * 获取评论表列表
     * uniapp端调用
     *
     * @param cmfComment
     * @return
     */
    @ApiResponse(code = 400, message = "获取评论表列表失败")
    @ApiOperation(value = "评论表列表", notes = "获取评论表列表")
    @GetMapping(value = "/mytable/comment/info/")
    public ResponseEntity<Object> info(CmfComment cmfComment) throws IOException{
        return new ResponseEntity<>(cmfCommentService.selectCmfCommentList(cmfComment), HttpStatus.OK);
    }
}