package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCrmMytableNoteMapper;
import com.vrcrm.mytable.domain.CmfCrmMytableNote;
import com.vrcrm.mytable.service.ICmfCrmMytableNoteService;

/**
 * 桌面便签表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmMytableNoteServiceImpl implements ICmfCrmMytableNoteService 
{
    @Autowired
    private CmfCrmMytableNoteMapper cmfCrmMytableNoteMapper;

    /**
     * 查询桌面便签表
     * 
     * @param id 桌面便签表主键
     * @return 桌面便签表
     */
    @Override
    public CmfCrmMytableNote selectCmfCrmMytableNoteById(Integer id)
    {
        return cmfCrmMytableNoteMapper.selectCmfCrmMytableNoteById(id);
    }

    /**
     * 查询桌面便签表列表
     * 
     * @param cmfCrmMytableNote 桌面便签表
     * @return 桌面便签表
     */
    @Override
    public List<CmfCrmMytableNote> selectCmfCrmMytableNoteList(CmfCrmMytableNote cmfCrmMytableNote)
    {
        return cmfCrmMytableNoteMapper.selectCmfCrmMytableNoteList(cmfCrmMytableNote);
    }

    /**
     * 新增桌面便签表
     * 
     * @param cmfCrmMytableNote 桌面便签表
     * @return 结果
     */
    @Override
    public int insertCmfCrmMytableNote(CmfCrmMytableNote cmfCrmMytableNote)
    {
        return cmfCrmMytableNoteMapper.insertCmfCrmMytableNote(cmfCrmMytableNote);
    }

    /**
     * 修改桌面便签表
     * 
     * @param cmfCrmMytableNote 桌面便签表
     * @return 结果
     */
    @Override
    public int updateCmfCrmMytableNote(CmfCrmMytableNote cmfCrmMytableNote)
    {
        return cmfCrmMytableNoteMapper.updateCmfCrmMytableNote(cmfCrmMytableNote);
    }

    /**
     * 批量删除桌面便签表
     * 
     * @param ids 需要删除的桌面便签表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmMytableNoteByIds(Integer[] ids)
    {
        return cmfCrmMytableNoteMapper.deleteCmfCrmMytableNoteByIds(ids);
    }

    /**
     * 删除桌面便签表信息
     * 
     * @param id 桌面便签表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmMytableNoteById(Integer id)
    {
        return cmfCrmMytableNoteMapper.deleteCmfCrmMytableNoteById(id);
    }
}
