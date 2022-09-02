package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfFeiyongclasseMapper;
import com.vrcrm.basicdata.domain.CmfFeiyongclasse;
import com.vrcrm.basicdata.service.ICmfFeiyongclasseService;

/**
 * 费用分类Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFeiyongclasseServiceImpl implements ICmfFeiyongclasseService 
{
    @Autowired
    private CmfFeiyongclasseMapper cmfFeiyongclasseMapper;

    /**
     * 查询费用分类
     * 
     * @param id 费用分类主键
     * @return 费用分类
     */
    @Override
    public CmfFeiyongclasse selectCmfFeiyongclasseById(Integer id)
    {
        return cmfFeiyongclasseMapper.selectCmfFeiyongclasseById(id);
    }

    /**
     * 查询费用分类列表
     * 
     * @param cmfFeiyongclasse 费用分类
     * @return 费用分类
     */
    @Override
    public List<CmfFeiyongclasse> selectCmfFeiyongclasseList(CmfFeiyongclasse cmfFeiyongclasse)
    {
        return cmfFeiyongclasseMapper.selectCmfFeiyongclasseList(cmfFeiyongclasse);
    }

    /**
     * 新增费用分类
     * 
     * @param cmfFeiyongclasse 费用分类
     * @return 结果
     */
    @Override
    public int insertCmfFeiyongclasse(CmfFeiyongclasse cmfFeiyongclasse)
    {
        return cmfFeiyongclasseMapper.insertCmfFeiyongclasse(cmfFeiyongclasse);
    }

    /**
     * 修改费用分类
     * 
     * @param cmfFeiyongclasse 费用分类
     * @return 结果
     */
    @Override
    public int updateCmfFeiyongclasse(CmfFeiyongclasse cmfFeiyongclasse)
    {
        return cmfFeiyongclasseMapper.updateCmfFeiyongclasse(cmfFeiyongclasse);
    }

    /**
     * 批量删除费用分类
     * 
     * @param ids 需要删除的费用分类主键
     * @return 结果
     */
    @Override
    public int deleteCmfFeiyongclasseByIds(Integer[] ids)
    {
        return cmfFeiyongclasseMapper.deleteCmfFeiyongclasseByIds(ids);
    }

    /**
     * 删除费用分类信息
     * 
     * @param id 费用分类主键
     * @return 结果
     */
    @Override
    public int deleteCmfFeiyongclasseById(Integer id)
    {
        return cmfFeiyongclasseMapper.deleteCmfFeiyongclasseById(id);
    }
}
