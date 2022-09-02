package com.vrcrm.buy.mapper;

import java.util.List;
import com.vrcrm.buy.domain.CmfHuikuanrecord;

/**
 * 汇款记录Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHuikuanrecordMapper 
{
    /**
     * 查询汇款记录
     * 
     * @param id 汇款记录主键
     * @return 汇款记录
     */
    public CmfHuikuanrecord selectCmfHuikuanrecordById(Integer id);

    /**
     * 查询汇款记录列表
     * 
     * @param cmfHuikuanrecord 汇款记录
     * @return 汇款记录集合
     */
    public List<CmfHuikuanrecord> selectCmfHuikuanrecordList(CmfHuikuanrecord cmfHuikuanrecord);

    /**
     * 新增汇款记录
     * 
     * @param cmfHuikuanrecord 汇款记录
     * @return 结果
     */
    public int insertCmfHuikuanrecord(CmfHuikuanrecord cmfHuikuanrecord);

    /**
     * 修改汇款记录
     * 
     * @param cmfHuikuanrecord 汇款记录
     * @return 结果
     */
    public int updateCmfHuikuanrecord(CmfHuikuanrecord cmfHuikuanrecord);

    /**
     * 删除汇款记录
     * 
     * @param id 汇款记录主键
     * @return 结果
     */
    public int deleteCmfHuikuanrecordById(Integer id);

    /**
     * 批量删除汇款记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHuikuanrecordByIds(Integer[] ids);
}
