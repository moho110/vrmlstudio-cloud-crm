package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfProductzuzhuangMapper;
import com.vrcrm.basicdata.domain.CmfProductzuzhuang;
import com.vrcrm.basicdata.service.ICmfProductzuzhuangService;

/**
 * 产品组装Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfProductzuzhuangServiceImpl implements ICmfProductzuzhuangService 
{
    @Autowired
    private CmfProductzuzhuangMapper cmfProductzuzhuangMapper;

    /**
     * 查询产品组装
     * 
     * @param id 产品组装主键
     * @return 产品组装
     */
    @Override
    public CmfProductzuzhuang selectCmfProductzuzhuangById(Integer id)
    {
        return cmfProductzuzhuangMapper.selectCmfProductzuzhuangById(id);
    }

    /**
     * 查询产品组装列表
     * 
     * @param cmfProductzuzhuang 产品组装
     * @return 产品组装
     */
    @Override
    public List<CmfProductzuzhuang> selectCmfProductzuzhuangList(CmfProductzuzhuang cmfProductzuzhuang)
    {
        return cmfProductzuzhuangMapper.selectCmfProductzuzhuangList(cmfProductzuzhuang);
    }

    /**
     * 新增产品组装
     * 
     * @param cmfProductzuzhuang 产品组装
     * @return 结果
     */
    @Override
    public int insertCmfProductzuzhuang(CmfProductzuzhuang cmfProductzuzhuang)
    {
        return cmfProductzuzhuangMapper.insertCmfProductzuzhuang(cmfProductzuzhuang);
    }

    /**
     * 修改产品组装
     * 
     * @param cmfProductzuzhuang 产品组装
     * @return 结果
     */
    @Override
    public int updateCmfProductzuzhuang(CmfProductzuzhuang cmfProductzuzhuang)
    {
        return cmfProductzuzhuangMapper.updateCmfProductzuzhuang(cmfProductzuzhuang);
    }

    /**
     * 批量删除产品组装
     * 
     * @param ids 需要删除的产品组装主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductzuzhuangByIds(Integer[] ids)
    {
        return cmfProductzuzhuangMapper.deleteCmfProductzuzhuangByIds(ids);
    }

    /**
     * 删除产品组装信息
     * 
     * @param id 产品组装主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductzuzhuangById(Integer id)
    {
        return cmfProductzuzhuangMapper.deleteCmfProductzuzhuangById(id);
    }
}
