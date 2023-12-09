package com.fox.dao;

import com.fox.domain.PromotionAd;

import java.util.List;

public interface PromotionAdMapper {

    /*
        分页查询广告信息
     */
    public List<PromotionAd> findAllPromotionAdByPage();
    // 主干代码2用于回退

    /*
        广告动态上下线
     */
    public void updatePromotionAdStatus(PromotionAd promotionAd);


}
