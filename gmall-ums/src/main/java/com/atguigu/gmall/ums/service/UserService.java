package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UserEntity;

import java.util.Map;

/**
 * 用户表
 *
 * @author Armer
 * @email armerr277@gmail.com
 * @date 2020-07-20 18:27:17
 */
public interface UserService extends IService<UserEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

