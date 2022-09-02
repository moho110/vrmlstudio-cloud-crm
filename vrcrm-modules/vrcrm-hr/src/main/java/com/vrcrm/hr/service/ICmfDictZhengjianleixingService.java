package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfDictZhengjianleixing;

/**
 * 证件类型Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfDictZhengjianleixingService 
{
    /**
     * 查询证件类型
     * 
     * @param id 证件类型主键
     * @return 证件类型
     */
    public CmfDictZhengjianleixing selectCmfDictZhengjianleixingById(Integer id);

    /**
     * 查询证件类型列表
     * 
     * @param cmfDictZhengjianleixing 证件类型
     * @return 证件类型集合
     */
    public List<CmfDictZhengjianleixing> selectCmfDictZhengjianleixingList(CmfDictZhengjianleixing cmfDictZhengjianleixing);

    /**
     * 新增证件类型
     * 
     * @param cmfDictZhengjianleixing 证件类型
     * @return 结果
     */
    public int insertCmfDictZhengjianleixing(CmfDictZhengjianleixing cmfDictZhengjianleixing);

    /**
     * 修改证件类型
     * 
     * @param cmfDictZhengjianleixing 证件类型
     * @return 结果
     */
    public int updateCmfDictZhengjianleixing(CmfDictZhengjianleixing cmfDictZhengjianleixing);

    /**
     * 批量删除证件类型
     * 
     * @param ids 需要删除的证件类型主键集合
     * @return 结果
     */
    public int deleteCmfDictZhengjianleixingByIds(Integer[] ids);

    /**
     * 删除证件类型信息
     * 
     * @param id 证件类型主键
     * @return 结果
     */
    public int deleteCmfDictZhengjianleixingById(Integer id);
}
