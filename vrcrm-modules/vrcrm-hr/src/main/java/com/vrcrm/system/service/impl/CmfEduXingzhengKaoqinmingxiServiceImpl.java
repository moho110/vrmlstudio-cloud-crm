package com.vrcrm.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.system.mapper.CmfEduXingzhengKaoqinmingxiMapper;
import com.vrcrm.system.domain.CmfEduXingzhengKaoqinmingxi;
import com.vrcrm.system.service.ICmfEduXingzhengKaoqinmingxiService;

/**
 * 考勤明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengKaoqinmingxiServiceImpl implements ICmfEduXingzhengKaoqinmingxiService 
{
    @Autowired
    private CmfEduXingzhengKaoqinmingxiMapper cmfEduXingzhengKaoqinmingxiMapper;

    /**
     * 查询考勤明细
     * 
     * @param id 考勤明细主键
     * @return 考勤明细
     */
    @Override
    public CmfEduXingzhengKaoqinmingxi selectCmfEduXingzhengKaoqinmingxiById(Integer id)
    {
        return cmfEduXingzhengKaoqinmingxiMapper.selectCmfEduXingzhengKaoqinmingxiById(id);
    }

    /**
     * 查询考勤明细列表
     * 
     * @param cmfEduXingzhengKaoqinmingxi 考勤明细
     * @return 考勤明细
     */
    @Override
    public List<CmfEduXingzhengKaoqinmingxi> selectCmfEduXingzhengKaoqinmingxiList(CmfEduXingzhengKaoqinmingxi cmfEduXingzhengKaoqinmingxi)
    {
        return cmfEduXingzhengKaoqinmingxiMapper.selectCmfEduXingzhengKaoqinmingxiList(cmfEduXingzhengKaoqinmingxi);
    }

    /**
     * 新增考勤明细
     * 
     * @param cmfEduXingzhengKaoqinmingxi 考勤明细
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengKaoqinmingxi(CmfEduXingzhengKaoqinmingxi cmfEduXingzhengKaoqinmingxi)
    {
        return cmfEduXingzhengKaoqinmingxiMapper.insertCmfEduXingzhengKaoqinmingxi(cmfEduXingzhengKaoqinmingxi);
    }

    /**
     * 修改考勤明细
     * 
     * @param cmfEduXingzhengKaoqinmingxi 考勤明细
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengKaoqinmingxi(CmfEduXingzhengKaoqinmingxi cmfEduXingzhengKaoqinmingxi)
    {
        return cmfEduXingzhengKaoqinmingxiMapper.updateCmfEduXingzhengKaoqinmingxi(cmfEduXingzhengKaoqinmingxi);
    }

    /**
     * 批量删除考勤明细
     * 
     * @param ids 需要删除的考勤明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengKaoqinmingxiByIds(Integer[] ids)
    {
        return cmfEduXingzhengKaoqinmingxiMapper.deleteCmfEduXingzhengKaoqinmingxiByIds(ids);
    }

    /**
     * 删除考勤明细信息
     * 
     * @param id 考勤明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengKaoqinmingxiById(Integer id)
    {
        return cmfEduXingzhengKaoqinmingxiMapper.deleteCmfEduXingzhengKaoqinmingxiById(id);
    }
}
