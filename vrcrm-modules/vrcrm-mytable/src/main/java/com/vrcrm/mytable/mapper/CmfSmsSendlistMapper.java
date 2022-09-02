package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfSmsSendlist;

/**
 * 短信发送清单Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSmsSendlistMapper 
{
    /**
     * 查询短信发送清单
     * 
     * @param id 短信发送清单主键
     * @return 短信发送清单
     */
    public CmfSmsSendlist selectCmfSmsSendlistById(Integer id);

    /**
     * 查询短信发送清单列表
     * 
     * @param cmfSmsSendlist 短信发送清单
     * @return 短信发送清单集合
     */
    public List<CmfSmsSendlist> selectCmfSmsSendlistList(CmfSmsSendlist cmfSmsSendlist);

    /**
     * 新增短信发送清单
     * 
     * @param cmfSmsSendlist 短信发送清单
     * @return 结果
     */
    public int insertCmfSmsSendlist(CmfSmsSendlist cmfSmsSendlist);

    /**
     * 修改短信发送清单
     * 
     * @param cmfSmsSendlist 短信发送清单
     * @return 结果
     */
    public int updateCmfSmsSendlist(CmfSmsSendlist cmfSmsSendlist);

    /**
     * 删除短信发送清单
     * 
     * @param id 短信发送清单主键
     * @return 结果
     */
    public int deleteCmfSmsSendlistById(Integer id);

    /**
     * 批量删除短信发送清单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSmsSendlistByIds(Integer[] ids);
}
