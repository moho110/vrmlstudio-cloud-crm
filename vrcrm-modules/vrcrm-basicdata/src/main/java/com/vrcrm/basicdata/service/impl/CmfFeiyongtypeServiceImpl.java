package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfFeiyongtypeMapper;
import com.vrcrm.basicdata.domain.CmfFeiyongtype;
import com.vrcrm.basicdata.service.ICmfFeiyongtypeService;

/**
 * 费用类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFeiyongtypeServiceImpl implements ICmfFeiyongtypeService 
{
    @Autowired
    private CmfFeiyongtypeMapper cmfFeiyongtypeMapper;

    /**
     * 查询费用类型
     * 
     * @param id 费用类型主键
     * @return 费用类型
     */
    @Override
    public CmfFeiyongtype selectCmfFeiyongtypeById(Integer id)
    {
        return cmfFeiyongtypeMapper.selectCmfFeiyongtypeById(id);
    }

    /**
     * 查询费用类型列表
     * 
     * @param cmfFeiyongtype 费用类型
     * @return 费用类型
     */
    @Override
    public List<CmfFeiyongtype> selectCmfFeiyongtypeList(CmfFeiyongtype cmfFeiyongtype)
    {
        return cmfFeiyongtypeMapper.selectCmfFeiyongtypeList(cmfFeiyongtype);
    }

    /**
     * 新增费用类型
     * 
     * @param cmfFeiyongtype 费用类型
     * @return 结果
     */
    @Override
    public int insertCmfFeiyongtype(CmfFeiyongtype cmfFeiyongtype)
    {
        return cmfFeiyongtypeMapper.insertCmfFeiyongtype(cmfFeiyongtype);
    }

    /**
     * 修改费用类型
     * 
     * @param cmfFeiyongtype 费用类型
     * @return 结果
     */
    @Override
    public int updateCmfFeiyongtype(CmfFeiyongtype cmfFeiyongtype)
    {
        return cmfFeiyongtypeMapper.updateCmfFeiyongtype(cmfFeiyongtype);
    }

    /**
     * 批量删除费用类型
     * 
     * @param ids 需要删除的费用类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfFeiyongtypeByIds(Integer[] ids)
    {
        return cmfFeiyongtypeMapper.deleteCmfFeiyongtypeByIds(ids);
    }

    /**
     * 删除费用类型信息
     * 
     * @param id 费用类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfFeiyongtypeById(Integer id)
    {
        return cmfFeiyongtypeMapper.deleteCmfFeiyongtypeById(id);
    }
}
