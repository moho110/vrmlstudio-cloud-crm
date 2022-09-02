package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfCmdictCountrycodeMapper;
import com.vrcrm.basicdata.domain.CmfCmdictCountrycode;
import com.vrcrm.basicdata.service.ICmfCmdictCountrycodeService;

/**
 * 国家代码Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCmdictCountrycodeServiceImpl implements ICmfCmdictCountrycodeService 
{
    @Autowired
    private CmfCmdictCountrycodeMapper cmfCmdictCountrycodeMapper;

    /**
     * 查询国家代码
     * 
     * @param id 国家代码主键
     * @return 国家代码
     */
    @Override
    public CmfCmdictCountrycode selectCmfCmdictCountrycodeById(Integer id)
    {
        return cmfCmdictCountrycodeMapper.selectCmfCmdictCountrycodeById(id);
    }

    /**
     * 查询国家代码列表
     * 
     * @param cmfCmdictCountrycode 国家代码
     * @return 国家代码
     */
    @Override
    public List<CmfCmdictCountrycode> selectCmfCmdictCountrycodeList(CmfCmdictCountrycode cmfCmdictCountrycode)
    {
        return cmfCmdictCountrycodeMapper.selectCmfCmdictCountrycodeList(cmfCmdictCountrycode);
    }

    /**
     * 新增国家代码
     * 
     * @param cmfCmdictCountrycode 国家代码
     * @return 结果
     */
    @Override
    public int insertCmfCmdictCountrycode(CmfCmdictCountrycode cmfCmdictCountrycode)
    {
        return cmfCmdictCountrycodeMapper.insertCmfCmdictCountrycode(cmfCmdictCountrycode);
    }

    /**
     * 修改国家代码
     * 
     * @param cmfCmdictCountrycode 国家代码
     * @return 结果
     */
    @Override
    public int updateCmfCmdictCountrycode(CmfCmdictCountrycode cmfCmdictCountrycode)
    {
        return cmfCmdictCountrycodeMapper.updateCmfCmdictCountrycode(cmfCmdictCountrycode);
    }

    /**
     * 批量删除国家代码
     * 
     * @param ids 需要删除的国家代码主键
     * @return 结果
     */
    @Override
    public int deleteCmfCmdictCountrycodeByIds(Integer[] ids)
    {
        return cmfCmdictCountrycodeMapper.deleteCmfCmdictCountrycodeByIds(ids);
    }

    /**
     * 删除国家代码信息
     * 
     * @param id 国家代码主键
     * @return 结果
     */
    @Override
    public int deleteCmfCmdictCountrycodeById(Integer id)
    {
        return cmfCmdictCountrycodeMapper.deleteCmfCmdictCountrycodeById(id);
    }
}
