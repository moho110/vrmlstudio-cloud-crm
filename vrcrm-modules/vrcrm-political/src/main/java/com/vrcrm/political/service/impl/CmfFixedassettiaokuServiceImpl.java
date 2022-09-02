package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassettiaokuMapper;
import com.vrcrm.political.domain.CmfFixedassettiaoku;
import com.vrcrm.political.service.ICmfFixedassettiaokuService;

/**
 * 固定资产调库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassettiaokuServiceImpl implements ICmfFixedassettiaokuService 
{
    @Autowired
    private CmfFixedassettiaokuMapper cmfFixedassettiaokuMapper;

    /**
     * 查询固定资产调库
     * 
     * @param id 固定资产调库主键
     * @return 固定资产调库
     */
    @Override
    public CmfFixedassettiaoku selectCmfFixedassettiaokuById(Integer id)
    {
        return cmfFixedassettiaokuMapper.selectCmfFixedassettiaokuById(id);
    }

    /**
     * 查询固定资产调库列表
     * 
     * @param cmfFixedassettiaoku 固定资产调库
     * @return 固定资产调库
     */
    @Override
    public List<CmfFixedassettiaoku> selectCmfFixedassettiaokuList(CmfFixedassettiaoku cmfFixedassettiaoku)
    {
        return cmfFixedassettiaokuMapper.selectCmfFixedassettiaokuList(cmfFixedassettiaoku);
    }

    /**
     * 新增固定资产调库
     * 
     * @param cmfFixedassettiaoku 固定资产调库
     * @return 结果
     */
    @Override
    public int insertCmfFixedassettiaoku(CmfFixedassettiaoku cmfFixedassettiaoku)
    {
        return cmfFixedassettiaokuMapper.insertCmfFixedassettiaoku(cmfFixedassettiaoku);
    }

    /**
     * 修改固定资产调库
     * 
     * @param cmfFixedassettiaoku 固定资产调库
     * @return 结果
     */
    @Override
    public int updateCmfFixedassettiaoku(CmfFixedassettiaoku cmfFixedassettiaoku)
    {
        return cmfFixedassettiaokuMapper.updateCmfFixedassettiaoku(cmfFixedassettiaoku);
    }

    /**
     * 批量删除固定资产调库
     * 
     * @param ids 需要删除的固定资产调库主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassettiaokuByIds(Integer[] ids)
    {
        return cmfFixedassettiaokuMapper.deleteCmfFixedassettiaokuByIds(ids);
    }

    /**
     * 删除固定资产调库信息
     * 
     * @param id 固定资产调库主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassettiaokuById(Integer id)
    {
        return cmfFixedassettiaokuMapper.deleteCmfFixedassettiaokuById(id);
    }
}
