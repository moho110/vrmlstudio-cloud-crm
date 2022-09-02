package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengQingjiaMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengQingjia;
import com.vrcrm.hr.service.ICmfEduXingzhengQingjiaService;

/**
 * 行政请假Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengQingjiaServiceImpl implements ICmfEduXingzhengQingjiaService 
{
    @Autowired
    private CmfEduXingzhengQingjiaMapper cmfEduXingzhengQingjiaMapper;

    /**
     * 查询行政请假
     * 
     * @param id 行政请假主键
     * @return 行政请假
     */
    @Override
    public CmfEduXingzhengQingjia selectCmfEduXingzhengQingjiaById(Integer id)
    {
        return cmfEduXingzhengQingjiaMapper.selectCmfEduXingzhengQingjiaById(id);
    }

    /**
     * 查询行政请假列表
     * 
     * @param cmfEduXingzhengQingjia 行政请假
     * @return 行政请假
     */
    @Override
    public List<CmfEduXingzhengQingjia> selectCmfEduXingzhengQingjiaList(CmfEduXingzhengQingjia cmfEduXingzhengQingjia)
    {
        return cmfEduXingzhengQingjiaMapper.selectCmfEduXingzhengQingjiaList(cmfEduXingzhengQingjia);
    }

    /**
     * 新增行政请假
     * 
     * @param cmfEduXingzhengQingjia 行政请假
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengQingjia(CmfEduXingzhengQingjia cmfEduXingzhengQingjia)
    {
        return cmfEduXingzhengQingjiaMapper.insertCmfEduXingzhengQingjia(cmfEduXingzhengQingjia);
    }

    /**
     * 修改行政请假
     * 
     * @param cmfEduXingzhengQingjia 行政请假
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengQingjia(CmfEduXingzhengQingjia cmfEduXingzhengQingjia)
    {
        return cmfEduXingzhengQingjiaMapper.updateCmfEduXingzhengQingjia(cmfEduXingzhengQingjia);
    }

    /**
     * 批量删除行政请假
     * 
     * @param ids 需要删除的行政请假主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengQingjiaByIds(Integer[] ids)
    {
        return cmfEduXingzhengQingjiaMapper.deleteCmfEduXingzhengQingjiaByIds(ids);
    }

    /**
     * 删除行政请假信息
     * 
     * @param id 行政请假主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengQingjiaById(Integer id)
    {
        return cmfEduXingzhengQingjiaMapper.deleteCmfEduXingzhengQingjiaById(id);
    }
}
