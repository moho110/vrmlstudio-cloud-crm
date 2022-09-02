package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfComment;

/**
 * 评论表Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCommentService 
{
    /**
     * 查询评论表
     * 
     * @param id 评论表主键
     * @return 评论表
     */
    public CmfComment selectCmfCommentById(Integer id);

    /**
     * 查询评论表列表
     * 
     * @param cmfComment 评论表
     * @return 评论表集合
     */
    public List<CmfComment> selectCmfCommentList(CmfComment cmfComment);

    /**
     * 新增评论表
     * 
     * @param cmfComment 评论表
     * @return 结果
     */
    public int insertCmfComment(CmfComment cmfComment);

    /**
     * 修改评论表
     * 
     * @param cmfComment 评论表
     * @return 结果
     */
    public int updateCmfComment(CmfComment cmfComment);

    /**
     * 批量删除评论表
     * 
     * @param ids 需要删除的评论表主键集合
     * @return 结果
     */
    public int deleteCmfCommentByIds(Integer[] ids);

    /**
     * 删除评论表信息
     * 
     * @param id 评论表主键
     * @return 结果
     */
    public int deleteCmfCommentById(Integer id);
}
