package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfNumzero;

/**
 * ZeroMapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfNumzeroMapper 
{
    /**
     * 查询Zero
     * 
     * @param id Zero主键
     * @return Zero
     */
    public CmfNumzero selectCmfNumzeroById(Integer id);

    /**
     * 查询Zero列表
     * 
     * @param cmfNumzero Zero
     * @return Zero集合
     */
    public List<CmfNumzero> selectCmfNumzeroList(CmfNumzero cmfNumzero);

    /**
     * 新增Zero
     * 
     * @param cmfNumzero Zero
     * @return 结果
     */
    public int insertCmfNumzero(CmfNumzero cmfNumzero);

    /**
     * 修改Zero
     * 
     * @param cmfNumzero Zero
     * @return 结果
     */
    public int updateCmfNumzero(CmfNumzero cmfNumzero);

    /**
     * 删除Zero
     * 
     * @param id Zero主键
     * @return 结果
     */
    public int deleteCmfNumzeroById(Integer id);

    /**
     * 批量删除Zero
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfNumzeroByIds(Integer[] ids);
}
