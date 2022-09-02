package com.vrcrm.mytable.service.impl;

import java.util.List;
import com.vrcrm.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCommentMapper;
import com.vrcrm.mytable.domain.CmfComment;
import com.vrcrm.mytable.service.ICmfCommentService;

/**
 * 评论表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCommentServiceImpl implements ICmfCommentService 
{
    @Autowired
    private CmfCommentMapper cmfCommentMapper;

    /**
     * 查询评论表
     * 
     * @param id 评论表主键
     * @return 评论表
     */
    @Override
    public CmfComment selectCmfCommentById(Integer id)
    {
        return cmfCommentMapper.selectCmfCommentById(id);
    }

    /**
     * 查询评论表列表
     * 
     * @param cmfComment 评论表
     * @return 评论表
     */
    @Override
    public List<CmfComment> selectCmfCommentList(CmfComment cmfComment)
    {
        return cmfCommentMapper.selectCmfCommentList(cmfComment);
    }

    /**
     * 新增评论表
     * 
     * @param cmfComment 评论表
     * @return 结果
     */
    @Override
    public int insertCmfComment(CmfComment cmfComment)
    {
        cmfComment.setCreateTime(DateUtils.getNowDate());
        return cmfCommentMapper.insertCmfComment(cmfComment);
    }

    /**
     * 修改评论表
     * 
     * @param cmfComment 评论表
     * @return 结果
     */
    @Override
    public int updateCmfComment(CmfComment cmfComment)
    {
        return cmfCommentMapper.updateCmfComment(cmfComment);
    }

    /**
     * 批量删除评论表
     * 
     * @param ids 需要删除的评论表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCommentByIds(Integer[] ids)
    {
        return cmfCommentMapper.deleteCmfCommentByIds(ids);
    }

    /**
     * 删除评论表信息
     * 
     * @param id 评论表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCommentById(Integer id)
    {
        return cmfCommentMapper.deleteCmfCommentById(id);
    }
}
