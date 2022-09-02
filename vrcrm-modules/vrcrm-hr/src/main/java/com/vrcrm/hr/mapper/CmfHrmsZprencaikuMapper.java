package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsZprencaiku;

/**
 * 招聘人才库Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsZprencaikuMapper 
{
    /**
     * 查询招聘人才库
     * 
     * @param id 招聘人才库主键
     * @return 招聘人才库
     */
    public CmfHrmsZprencaiku selectCmfHrmsZprencaikuById(Integer id);

    /**
     * 查询招聘人才库列表
     * 
     * @param cmfHrmsZprencaiku 招聘人才库
     * @return 招聘人才库集合
     */
    public List<CmfHrmsZprencaiku> selectCmfHrmsZprencaikuList(CmfHrmsZprencaiku cmfHrmsZprencaiku);

    /**
     * 新增招聘人才库
     * 
     * @param cmfHrmsZprencaiku 招聘人才库
     * @return 结果
     */
    public int insertCmfHrmsZprencaiku(CmfHrmsZprencaiku cmfHrmsZprencaiku);

    /**
     * 修改招聘人才库
     * 
     * @param cmfHrmsZprencaiku 招聘人才库
     * @return 结果
     */
    public int updateCmfHrmsZprencaiku(CmfHrmsZprencaiku cmfHrmsZprencaiku);

    /**
     * 删除招聘人才库
     * 
     * @param id 招聘人才库主键
     * @return 结果
     */
    public int deleteCmfHrmsZprencaikuById(Integer id);

    /**
     * 批量删除招聘人才库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsZprencaikuByIds(Integer[] ids);
}
