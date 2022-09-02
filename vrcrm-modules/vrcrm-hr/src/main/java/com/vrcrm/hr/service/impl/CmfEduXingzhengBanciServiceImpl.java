package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengBanciMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengBanci;
import com.vrcrm.hr.service.ICmfEduXingzhengBanciService;

/**
 * 行政班次Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengBanciServiceImpl implements ICmfEduXingzhengBanciService 
{
    @Autowired
    private CmfEduXingzhengBanciMapper cmfEduXingzhengBanciMapper;

    /**
     * 查询行政班次
     * 
     * @param id 行政班次主键
     * @return 行政班次
     */
    @Override
    public CmfEduXingzhengBanci selectCmfEduXingzhengBanciById(Integer id)
    {
        return cmfEduXingzhengBanciMapper.selectCmfEduXingzhengBanciById(id);
    }

    /**
     * 查询行政班次列表
     * 
     * @param cmfEduXingzhengBanci 行政班次
     * @return 行政班次
     */
    @Override
    public List<CmfEduXingzhengBanci> selectCmfEduXingzhengBanciList(CmfEduXingzhengBanci cmfEduXingzhengBanci)
    {
        return cmfEduXingzhengBanciMapper.selectCmfEduXingzhengBanciList(cmfEduXingzhengBanci);
    }

    /**
     * 新增行政班次
     * 
     * @param cmfEduXingzhengBanci 行政班次
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengBanci(CmfEduXingzhengBanci cmfEduXingzhengBanci)
    {
        return cmfEduXingzhengBanciMapper.insertCmfEduXingzhengBanci(cmfEduXingzhengBanci);
    }

    /**
     * 修改行政班次
     * 
     * @param cmfEduXingzhengBanci 行政班次
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengBanci(CmfEduXingzhengBanci cmfEduXingzhengBanci)
    {
        return cmfEduXingzhengBanciMapper.updateCmfEduXingzhengBanci(cmfEduXingzhengBanci);
    }

    /**
     * 批量删除行政班次
     * 
     * @param ids 需要删除的行政班次主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengBanciByIds(Integer[] ids)
    {
        return cmfEduXingzhengBanciMapper.deleteCmfEduXingzhengBanciByIds(ids);
    }

    /**
     * 删除行政班次信息
     * 
     * @param id 行政班次主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengBanciById(Integer id)
    {
        return cmfEduXingzhengBanciMapper.deleteCmfEduXingzhengBanciById(id);
    }
}
