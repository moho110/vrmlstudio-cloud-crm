package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCrmMytableNote;

/**
 * 桌面便签表Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCrmMytableNoteService 
{
    /**
     * 查询桌面便签表
     * 
     * @param id 桌面便签表主键
     * @return 桌面便签表
     */
    public CmfCrmMytableNote selectCmfCrmMytableNoteById(Integer id);

    /**
     * 查询桌面便签表列表
     * 
     * @param cmfCrmMytableNote 桌面便签表
     * @return 桌面便签表集合
     */
    public List<CmfCrmMytableNote> selectCmfCrmMytableNoteList(CmfCrmMytableNote cmfCrmMytableNote);

    /**
     * 新增桌面便签表
     * 
     * @param cmfCrmMytableNote 桌面便签表
     * @return 结果
     */
    public int insertCmfCrmMytableNote(CmfCrmMytableNote cmfCrmMytableNote);

    /**
     * 修改桌面便签表
     * 
     * @param cmfCrmMytableNote 桌面便签表
     * @return 结果
     */
    public int updateCmfCrmMytableNote(CmfCrmMytableNote cmfCrmMytableNote);

    /**
     * 批量删除桌面便签表
     * 
     * @param ids 需要删除的桌面便签表主键集合
     * @return 结果
     */
    public int deleteCmfCrmMytableNoteByIds(Integer[] ids);

    /**
     * 删除桌面便签表信息
     * 
     * @param id 桌面便签表主键
     * @return 结果
     */
    public int deleteCmfCrmMytableNoteById(Integer id);
}
