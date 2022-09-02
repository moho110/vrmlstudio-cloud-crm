package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengKaoqinbudengMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengKaoqinbudeng;
import com.vrcrm.hr.service.ICmfEduXingzhengKaoqinbudengService;

/**
 * 行政考勤补登Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengKaoqinbudengServiceImpl implements ICmfEduXingzhengKaoqinbudengService 
{
    @Autowired
    private CmfEduXingzhengKaoqinbudengMapper cmfEduXingzhengKaoqinbudengMapper;

    /**
     * 查询行政考勤补登
     * 
     * @param id 行政考勤补登主键
     * @return 行政考勤补登
     */
    @Override
    public CmfEduXingzhengKaoqinbudeng selectCmfEduXingzhengKaoqinbudengById(Integer id)
    {
        return cmfEduXingzhengKaoqinbudengMapper.selectCmfEduXingzhengKaoqinbudengById(id);
    }

    /**
     * 查询行政考勤补登列表
     * 
     * @param cmfEduXingzhengKaoqinbudeng 行政考勤补登
     * @return 行政考勤补登
     */
    @Override
    public List<CmfEduXingzhengKaoqinbudeng> selectCmfEduXingzhengKaoqinbudengList(CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng)
    {
        return cmfEduXingzhengKaoqinbudengMapper.selectCmfEduXingzhengKaoqinbudengList(cmfEduXingzhengKaoqinbudeng);
    }

    /**
     * 新增行政考勤补登
     * 
     * @param cmfEduXingzhengKaoqinbudeng 行政考勤补登
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengKaoqinbudeng(CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng)
    {
        return cmfEduXingzhengKaoqinbudengMapper.insertCmfEduXingzhengKaoqinbudeng(cmfEduXingzhengKaoqinbudeng);
    }

    /**
     * 修改行政考勤补登
     * 
     * @param cmfEduXingzhengKaoqinbudeng 行政考勤补登
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengKaoqinbudeng(CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng)
    {
        return cmfEduXingzhengKaoqinbudengMapper.updateCmfEduXingzhengKaoqinbudeng(cmfEduXingzhengKaoqinbudeng);
    }

    /**
     * 批量删除行政考勤补登
     * 
     * @param ids 需要删除的行政考勤补登主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengKaoqinbudengByIds(Integer[] ids)
    {
        return cmfEduXingzhengKaoqinbudengMapper.deleteCmfEduXingzhengKaoqinbudengByIds(ids);
    }

    /**
     * 删除行政考勤补登信息
     * 
     * @param id 行政考勤补登主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengKaoqinbudengById(Integer id)
    {
        return cmfEduXingzhengKaoqinbudengMapper.deleteCmfEduXingzhengKaoqinbudengById(id);
    }
}
