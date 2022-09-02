package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfWuBuildinginformation;

/**
 * 房产信息Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfWuBuildinginformationService 
{
    /**
     * 查询房产信息
     * 
     * @param id 房产信息主键
     * @return 房产信息
     */
    public CmfWuBuildinginformation selectCmfWuBuildinginformationById(Integer id);

    /**
     * 查询房产信息列表
     * 
     * @param cmfWuBuildinginformation 房产信息
     * @return 房产信息集合
     */
    public List<CmfWuBuildinginformation> selectCmfWuBuildinginformationList(CmfWuBuildinginformation cmfWuBuildinginformation);

    /**
     * 新增房产信息
     * 
     * @param cmfWuBuildinginformation 房产信息
     * @return 结果
     */
    public int insertCmfWuBuildinginformation(CmfWuBuildinginformation cmfWuBuildinginformation);

    /**
     * 修改房产信息
     * 
     * @param cmfWuBuildinginformation 房产信息
     * @return 结果
     */
    public int updateCmfWuBuildinginformation(CmfWuBuildinginformation cmfWuBuildinginformation);

    /**
     * 批量删除房产信息
     * 
     * @param ids 需要删除的房产信息主键集合
     * @return 结果
     */
    public int deleteCmfWuBuildinginformationByIds(Integer[] ids);

    /**
     * 删除房产信息信息
     * 
     * @param id 房产信息主键
     * @return 结果
     */
    public int deleteCmfWuBuildinginformationById(Integer id);
}
