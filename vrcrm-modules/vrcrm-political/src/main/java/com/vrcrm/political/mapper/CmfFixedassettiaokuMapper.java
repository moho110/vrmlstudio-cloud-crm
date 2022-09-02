package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedassettiaoku;

/**
 * 固定资产调库Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfFixedassettiaokuMapper 
{
    /**
     * 查询固定资产调库
     * 
     * @param id 固定资产调库主键
     * @return 固定资产调库
     */
    public CmfFixedassettiaoku selectCmfFixedassettiaokuById(Integer id);

    /**
     * 查询固定资产调库列表
     * 
     * @param cmfFixedassettiaoku 固定资产调库
     * @return 固定资产调库集合
     */
    public List<CmfFixedassettiaoku> selectCmfFixedassettiaokuList(CmfFixedassettiaoku cmfFixedassettiaoku);

    /**
     * 新增固定资产调库
     * 
     * @param cmfFixedassettiaoku 固定资产调库
     * @return 结果
     */
    public int insertCmfFixedassettiaoku(CmfFixedassettiaoku cmfFixedassettiaoku);

    /**
     * 修改固定资产调库
     * 
     * @param cmfFixedassettiaoku 固定资产调库
     * @return 结果
     */
    public int updateCmfFixedassettiaoku(CmfFixedassettiaoku cmfFixedassettiaoku);

    /**
     * 删除固定资产调库
     * 
     * @param id 固定资产调库主键
     * @return 结果
     */
    public int deleteCmfFixedassettiaokuById(Integer id);

    /**
     * 批量删除固定资产调库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfFixedassettiaokuByIds(Integer[] ids);
}
