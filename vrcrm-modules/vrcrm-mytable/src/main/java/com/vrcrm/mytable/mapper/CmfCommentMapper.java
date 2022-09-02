package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfComment;

/**
 * 评论表Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfCommentMapper 
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
     * 删除评论表
     * 
     * @param id 评论表主键
     * @return 结果
     */
    public int deleteCmfCommentById(Integer id);

    /**
     * 批量删除评论表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCommentByIds(Integer[] ids);
}
