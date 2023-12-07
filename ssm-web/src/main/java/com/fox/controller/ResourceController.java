package com.fox.controller;

import com.github.pagehelper.PageInfo;
import com.fox.domain.Resource;
import com.fox.domain.ResourseVo;
import com.fox.domain.ResponseResult;
import com.fox.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    public ResourceService resourceService;

    @RequestMapping("/findAllResource")
    public ResponseResult findAllResourceByPage(@RequestBody ResourseVo resourseVo){

        PageInfo<Resource> pageInfo = resourceService.findAllResourceByPage(resourseVo);

        return  new ResponseResult(true,200,"资源信息分页多条件查询成功",pageInfo);

    }



}
