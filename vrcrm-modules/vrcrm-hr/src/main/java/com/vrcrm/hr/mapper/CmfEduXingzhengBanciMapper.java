package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengBanci;

/**
 * 行政班次Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduXingzhengBanciMapper 
{
    /**
     * 查询行政班次
     * 
     * @param id 行政班次主键
     * @return 行政班次
     */
    public CmfEduXingzhengBanci selectCmfEduXingzhengBanciById(Integer id);

    /**
     * 查询行政班次列表
     * 
     * @param cmfEduXingzhengBanci 行政班次
     * @return 行政班次集合
     */
    public List<CmfEduXingzhengBanci> selectCmfEduXingzhengBanciList(CmfEduXingzhengBanci cmfEduXingzhengBanci);

    /**
     * 新增行政班次
     * 
     * @param cmfEduXingzhengBanci 行政班次
     * @return 结果
     */
    public int insertCmfEduXingzhengBanci(CmfEduXingzhengBanci cmfEduXingzhengBanci);

    /**
     * 修改行政班次
     * 
     * @param cmfEduXingzhengBanci 行政班次
     * @return 结果
     */
    public int updateCmfEduXingzhengBanci(CmfEduXingzhengBanci cmfEduXingzhengBanci);

    /**
     * 删除行政班次
     * 
     * @param id 行政班次主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengBanciById(Integer id);

    /**
     * 批量删除行政班次
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengBanciByIds(Integer[] ids);
}
