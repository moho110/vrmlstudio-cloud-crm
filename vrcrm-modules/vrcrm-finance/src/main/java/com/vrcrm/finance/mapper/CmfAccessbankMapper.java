package com.vrcrm.finance.mapper;

import java.util.List;
import com.vrcrm.finance.domain.CmfAccessbank;

/**
 * 帐号操作Mapper接口
 * 
 * @author VRer
 * @date 2022-04-13
 */
public interface CmfAccessbankMapper 
{
    /**
     * 查询帐号操作
     * 
     * @param id 帐号操作主键
     * @return 帐号操作
     */
    public CmfAccessbank selectCmfAccessbankById(Integer id);

    /**
     * 查询帐号操作列表
     * 
     * @param cmfAccessbank 帐号操作
     * @return 帐号操作集合
     */
    public List<CmfAccessbank> selectCmfAccessbankList(CmfAccessbank cmfAccessbank);

    /**
     * 新增帐号操作
     * 
     * @param cmfAccessbank 帐号操作
     * @return 结果
     */
    public int insertCmfAccessbank(CmfAccessbank cmfAccessbank);

    /**
     * 修改帐号操作
     * 
     * @param cmfAccessbank 帐号操作
     * @return 结果
     */
    public int updateCmfAccessbank(CmfAccessbank cmfAccessbank);

    /**
     * 删除帐号操作
     * 
     * @param id 帐号操作主键
     * @return 结果
     */
    public int deleteCmfAccessbankById(Integer id);

    /**
     * 批量删除帐号操作
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfAccessbankByIds(Integer[] ids);
}
