package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfDictXingzhengQingjiaMapper;
import com.vrcrm.hr.domain.CmfDictXingzhengQingjia;
import com.vrcrm.hr.service.ICmfDictXingzhengQingjiaService;

/**
 * 行政请假Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictXingzhengQingjiaServiceImpl implements ICmfDictXingzhengQingjiaService 
{
    @Autowired
    private CmfDictXingzhengQingjiaMapper cmfDictXingzhengQingjiaMapper;

    /**
     * 查询行政请假
     * 
     * @param id 行政请假主键
     * @return 行政请假
     */
    @Override
    public CmfDictXingzhengQingjia selectCmfDictXingzhengQingjiaById(Integer id)
    {
        return cmfDictXingzhengQingjiaMapper.selectCmfDictXingzhengQingjiaById(id);
    }

    /**
     * 查询行政请假列表
     * 
     * @param cmfDictXingzhengQingjia 行政请假
     * @return 行政请假
     */
    @Override
    public List<CmfDictXingzhengQingjia> selectCmfDictXingzhengQingjiaList(CmfDictXingzhengQingjia cmfDictXingzhengQingjia)
    {
        return cmfDictXingzhengQingjiaMapper.selectCmfDictXingzhengQingjiaList(cmfDictXingzhengQingjia);
    }

    /**
     * 新增行政请假
     * 
     * @param cmfDictXingzhengQingjia 行政请假
     * @return 结果
     */
    @Override
    public int insertCmfDictXingzhengQingjia(CmfDictXingzhengQingjia cmfDictXingzhengQingjia)
    {
        return cmfDictXingzhengQingjiaMapper.insertCmfDictXingzhengQingjia(cmfDictXingzhengQingjia);
    }

    /**
     * 修改行政请假
     * 
     * @param cmfDictXingzhengQingjia 行政请假
     * @return 结果
     */
    @Override
    public int updateCmfDictXingzhengQingjia(CmfDictXingzhengQingjia cmfDictXingzhengQingjia)
    {
        return cmfDictXingzhengQingjiaMapper.updateCmfDictXingzhengQingjia(cmfDictXingzhengQingjia);
    }

    /**
     * 批量删除行政请假
     * 
     * @param ids 需要删除的行政请假主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictXingzhengQingjiaByIds(Integer[] ids)
    {
        return cmfDictXingzhengQingjiaMapper.deleteCmfDictXingzhengQingjiaByIds(ids);
    }

    /**
     * 删除行政请假信息
     * 
     * @param id 行政请假主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictXingzhengQingjiaById(Integer id)
    {
        return cmfDictXingzhengQingjiaMapper.deleteCmfDictXingzhengQingjiaById(id);
    }
}
