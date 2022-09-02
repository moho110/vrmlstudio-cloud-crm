package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedassettui;

/**
 * 固定资产归还Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfFixedassettuiService 
{
    /**
     * 查询固定资产归还
     * 
     * @param id 固定资产归还主键
     * @return 固定资产归还
     */
    public CmfFixedassettui selectCmfFixedassettuiById(Integer id);

    /**
     * 查询固定资产归还列表
     * 
     * @param cmfFixedassettui 固定资产归还
     * @return 固定资产归还集合
     */
    public List<CmfFixedassettui> selectCmfFixedassettuiList(CmfFixedassettui cmfFixedassettui);

    /**
     * 新增固定资产归还
     * 
     * @param cmfFixedassettui 固定资产归还
     * @return 结果
     */
    public int insertCmfFixedassettui(CmfFixedassettui cmfFixedassettui);

    /**
     * 修改固定资产归还
     * 
     * @param cmfFixedassettui 固定资产归还
     * @return 结果
     */
    public int updateCmfFixedassettui(CmfFixedassettui cmfFixedassettui);

    /**
     * 批量删除固定资产归还
     * 
     * @param ids 需要删除的固定资产归还主键集合
     * @return 结果
     */
    public int deleteCmfFixedassettuiByIds(Integer[] ids);

    /**
     * 删除固定资产归还信息
     * 
     * @param id 固定资产归还主键
     * @return 结果
     */
    public int deleteCmfFixedassettuiById(Integer id);
}
