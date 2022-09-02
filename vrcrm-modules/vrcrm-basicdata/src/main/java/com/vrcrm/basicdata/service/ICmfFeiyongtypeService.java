package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfFeiyongtype;

/**
 * 费用类型Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfFeiyongtypeService 
{
    /**
     * 查询费用类型
     * 
     * @param id 费用类型主键
     * @return 费用类型
     */
    public CmfFeiyongtype selectCmfFeiyongtypeById(Integer id);

    /**
     * 查询费用类型列表
     * 
     * @param cmfFeiyongtype 费用类型
     * @return 费用类型集合
     */
    public List<CmfFeiyongtype> selectCmfFeiyongtypeList(CmfFeiyongtype cmfFeiyongtype);

    /**
     * 新增费用类型
     * 
     * @param cmfFeiyongtype 费用类型
     * @return 结果
     */
    public int insertCmfFeiyongtype(CmfFeiyongtype cmfFeiyongtype);

    /**
     * 修改费用类型
     * 
     * @param cmfFeiyongtype 费用类型
     * @return 结果
     */
    public int updateCmfFeiyongtype(CmfFeiyongtype cmfFeiyongtype);

    /**
     * 批量删除费用类型
     * 
     * @param ids 需要删除的费用类型主键集合
     * @return 结果
     */
    public int deleteCmfFeiyongtypeByIds(Integer[] ids);

    /**
     * 删除费用类型信息
     * 
     * @param id 费用类型主键
     * @return 结果
     */
    public int deleteCmfFeiyongtypeById(Integer id);
}
