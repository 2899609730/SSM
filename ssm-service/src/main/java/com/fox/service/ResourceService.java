package com.fox.service;

import com.github.pagehelper.PageInfo;
import com.fox.domain.Resource;
import com.fox.domain.ResourseVo;

public interface ResourceService {

   /*（
        资源分页&多条件查询
     */

    public PageInfo<Resource> findAllResourceByPage(ResourseVo resourseVo);


}
