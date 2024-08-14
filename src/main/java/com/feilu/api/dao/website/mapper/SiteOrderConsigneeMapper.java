package com.feilu.api.dao.website.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import com.feilu.api.dao.website.entity.SiteOrderConsignee;
import org.apache.ibatis.annotations.Param;

/**
 *  映射层。
 *
 * @author dzh
 * @since 2024-08-09
 */
@Mapper
public interface SiteOrderConsigneeMapper extends BaseMapper<SiteOrderConsignee> {

    String selectDefaultCurrency(@Param("orderId") String orderId);
}