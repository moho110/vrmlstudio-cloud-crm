package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsRPNameMapper;
import com.vrcrm.hr.domain.CmfHrmsRPName;
import com.vrcrm.hr.service.ICmfHrmsRPNameService;

/**
 * 奖惩名称Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsRPNameServiceImpl implements ICmfHrmsRPNameService 
{
    @Autowired
    private CmfHrmsRPNameMapper cmfHrmsRPNameMapper;

    /**
     * 查询奖惩名称
     * 
     * @param id 奖惩名称主键
     * @return 奖惩名称
     */
    @Override
    public CmfHrmsRPName selectCmfHrmsRPNameById(Integer id)
    {
        return cmfHrmsRPNameMapper.selectCmfHrmsRPNameById(id);
    }

    /**
     * 查询奖惩名称列表
     * 
     * @param cmfHrmsRPName 奖惩名称
     * @return 奖惩名称
     */
    @Override
    public List<CmfHrmsRPName> selectCmfHrmsRPNameList(CmfHrmsRPName cmfHrmsRPName)
    {
        return cmfHrmsRPNameMapper.selectCmfHrmsRPNameList(cmfHrmsRPName);
    }

    /**
     * 新增奖惩名称
     * 
     * @param cmfHrmsRPName 奖惩名称
     * @return 结果
     */
    @Override
    public int insertCmfHrmsRPName(CmfHrmsRPName cmfHrmsRPName)
    {
        return cmfHrmsRPNameMapper.insertCmfHrmsRPName(cmfHrmsRPName);
    }

    /**
     * 修改奖惩名称
     * 
     * @param cmfHrmsRPName 奖惩名称
     * @return 结果
     */
    @Override
    public int updateCmfHrmsRPName(CmfHrmsRPName cmfHrmsRPName)
    {
        return cmfHrmsRPNameMapper.updateCmfHrmsRPName(cmfHrmsRPName);
    }

    /**
     * 批量删除奖惩名称
     * 
     * @param ids 需要删除的奖惩名称主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsRPNameByIds(Integer[] ids)
    {
        return cmfHrmsRPNameMapper.deleteCmfHrmsRPNameByIds(ids);
    }

    /**
     * 删除奖惩名称信息
     * 
     * @param id 奖惩名称主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsRPNameById(Integer id)
    {
        return cmfHrmsRPNameMapper.deleteCmfHrmsRPNameById(id);
    }
}
