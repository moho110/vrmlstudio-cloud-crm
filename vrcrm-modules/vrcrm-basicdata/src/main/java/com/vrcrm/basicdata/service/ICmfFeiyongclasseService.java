package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfFeiyongclasse;

/**
 * 费用分类Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfFeiyongclasseService 
{
    /**
     * 查询费用分类
     * 
     * @param id 费用分类主键
     * @return 费用分类
     */
    public CmfFeiyongclasse selectCmfFeiyongclasseById(Integer id);

    /**
     * 查询费用分类列表
     * 
     * @param cmfFeiyongclasse 费用分类
     * @return 费用分类集合
     */
    public List<CmfFeiyongclasse> selectCmfFeiyongclasseList(CmfFeiyongclasse cmfFeiyongclasse);

    /**
     * 新增费用分类
     * 
     * @param cmfFeiyongclasse 费用分类
     * @return 结果
     */
    public int insertCmfFeiyongclasse(CmfFeiyongclasse cmfFeiyongclasse);

    /**
     * 修改费用分类
     * 
     * @param cmfFeiyongclasse 费用分类
     * @return 结果
     */
    public int updateCmfFeiyongclasse(CmfFeiyongclasse cmfFeiyongclasse);

    /**
     * 批量删除费用分类
     * 
     * @param ids 需要删除的费用分类主键集合
     * @return 结果
     */
    public int deleteCmfFeiyongclasseByIds(Integer[] ids);

    /**
     * 删除费用分类信息
     * 
     * @param id 费用分类主键
     * @return 结果
     */
    public int deleteCmfFeiyongclasseById(Integer id);
}
