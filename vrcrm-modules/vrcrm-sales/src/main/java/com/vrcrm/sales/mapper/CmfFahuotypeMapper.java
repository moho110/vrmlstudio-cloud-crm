package com.vrcrm.sales.mapper;

import java.util.List;
import com.vrcrm.sales.domain.CmfFahuotype;

/**
 * 发货类型Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfFahuotypeMapper 
{
    /**
     * 查询发货类型
     * 
     * @param id 发货类型主键
     * @return 发货类型
     */
    public CmfFahuotype selectCmfFahuotypeById(Integer id);

    /**
     * 查询发货类型列表
     * 
     * @param cmfFahuotype 发货类型
     * @return 发货类型集合
     */
    public List<CmfFahuotype> selectCmfFahuotypeList(CmfFahuotype cmfFahuotype);

    /**
     * 新增发货类型
     * 
     * @param cmfFahuotype 发货类型
     * @return 结果
     */
    public int insertCmfFahuotype(CmfFahuotype cmfFahuotype);

    /**
     * 修改发货类型
     * 
     * @param cmfFahuotype 发货类型
     * @return 结果
     */
    public int updateCmfFahuotype(CmfFahuotype cmfFahuotype);

    /**
     * 删除发货类型
     * 
     * @param id 发货类型主键
     * @return 结果
     */
    public int deleteCmfFahuotypeById(Integer id);

    /**
     * 批量删除发货类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfFahuotypeByIds(Integer[] ids);
}
